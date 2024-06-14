# language:es
# encoding :UTF-8

Característica: Como cliente de Banco de Bogota quiero automatizar el demo del auth3.0
@Login
  Esquema del escenario: ingresar al demo del autenticador
    Dado  que el usuario ingrese al formularioTicket
    Cuando Complete el formulario con la siguiente informacion
      |Specific|Celular|Cedula|Email|
      |<Specific>|<Celular>|<Cedula>|<Email>|

    Ejemplos:
      |Specific                            |Celular   |Cedula    |Email        |
      |354daa8f-42bf-406e-9d6f-5e939c6c8a0e|3124627457|1000241478|cas@gmail.com|

