postgresql-repo:
  pkgrepo.managed:
    - name: deb http://apt.postgresql.org/pub/repos/apt/trusty-pgdg main
    - file: /etc/apt/sources.list.d/pgdg.list
    - key_url: https://www.postgresql.org/media/keys/ACCC4CF8.asc

postgresql-pkgs:
  pkg.installed:
    - names:
      - postgresql-9.4
      - postgresql-9.4-plv8
      - postgresql-contrib-9.4
      - python-bcrypt
    - require:
      - pkgrepo: postgresql-repo

postgresql-svc:
  service.running:
    - name: postgresql
    - enable: True
    - require:
      - pkg: postgresql-pkgs
    - watch:
      - file: postgresql_conf
      - file: pg_hba_conf

postgres_directory:
  file.directory:
    - name: /data/postgresql
    - makedirs: True
    - user: postgres
    - group: postgres
    - dir_mode: 700
    - file_mode: 600
    - require:
      - pkg: postgresql-pkgs

drop_cluster:
  cmd.run:
    - name: pg_dropcluster --stop 9.4 main
    - onlyif: test -d /etc/postgresql/9.4/main
    - require:
      - pkg: postgresql-pkgs

create_cluster:
  cmd.wait:
    - name: pg_createcluster 9.4 openfire -d /data/postgresql -l /var/log/postgresql/postgresql-9.4-openfire.log --start-conf auto
    - require:
      - file: postgres_directory
    - watch:
      - cmd: drop_cluster

postgresql_conf:
  file.managed:
    - name: /etc/postgresql/9.4/openfire/postgresql.conf
    - source: salt://saltstack/postgresql/files/postgresql.conf
    - user: postgres
    - group: postgres
    - template: jinja
    - require:
      - file: postgres_directory
      - pkg: postgresql-pkgs
      - cmd: create_cluster

pg_hba_conf:
  file.managed:
    - name: /etc/postgresql/9.4/openfire/pg_hba.conf
    - source: salt://saltstack/postgresql/files/pg_hba.conf
    - user: postgres
    - group: postgres
    - template: jinja
    - require:
      - file: postgresql_conf

create_database:
  postgres_database.present:
    - name: openfire
    - require:
      - service: postgresql-svc

#admin:
#  postgres_user.present:
#    - createdb: True
#    - superuser: True
#    - password: tmp
#    - require:
#      - service: postgresql-svc
