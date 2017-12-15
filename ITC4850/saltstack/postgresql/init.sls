{% from 'saltstack/postgresql/vars.j2' import postgres with context %}
include:
{% if grains['os'] == 'Ubuntu' %}
  - .install
  - .config
  - .certs
  - .service
  - .users
  {% endif %}
{% else %}
  - .unsupported
{% endif %}

# vim: set ft=yaml ts=2 sw=2 et sts=2:
