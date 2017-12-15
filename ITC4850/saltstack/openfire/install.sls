install_jre:
  pkg.installed:
    - name: default-jre

download_openfire:
  pkg.installed:
    - name: openfire-server
    - sources:
      - openfire-server: https://www.igniterealtime.org/downloadServlet?filename=openfire/openfire_4.2.1_all.deb
    - require:
      - pkg: install_jre


