# language:es
# encoding :UTF-8

Característica: Quiero hacer log in

@LoginErroneo
  Esquema del escenario: ingresar a la pagina de orange (credenciales invalidas)
    Dado  que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      |Usuario|Contraseña|
      |<Usuario>|<Contraseña>|
  Entonces visualizara el mensaje de error
    Ejemplos:
      |Usuario  |Contraseña |
      |Daniel  |   123456|



  @LoginSoloUsuario
  Esquema del escenario: ingresar a la pagina de orange (credencial solo usuario)
    Dado  que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      |Usuario|Contraseña|
      |<Usuario>|<Contraseña>|
    Entonces vera el mensaje que el campo es requerido
    Ejemplos:
      |Usuario  |Contraseña |
      |Daniel  |            |

    @LoginVacio
    Esquema del escenario: ingresar a la pagina de orange con credenciales vacias
      Dado  que el usuario ingrese a la pagina de orange
      Cuando complete el formulario con la siguiente informacion,luego da clic boton login
        |Usuario|Contraseña|
        |<Usuario>| <Contraseña> |
      Entonces vera el mensaje que los campos son requeridos
      Ejemplos:
        |Usuario  |Contraseña |
        |        |            |


  @CreacionDeUsuarioAdmin
  Esquema del escenario:ingresar a la pagina de orange
    Dado que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      | Usuario  | Contraseña  |
      | <Usuario> | <Contraseña> |
    Entonces ingresara un nuevo usuario "<EmployeeName>", "<NuevoUsuario>", "<Clave>", "<ConfirmarClave>"

    Ejemplos:
      | Usuario  | Contraseña | EmployeeName     | NuevoUsuario |       Clave           |          ConfirmarClave |
      | Admin    | admin123   | FName LName          |  1Daniel123   |      Daniel123       |            Daniel123    |

  @ModificarUsuarioAdmin
  Esquema del escenario: Ingresar a OrangeHRM, crear y modificar un usuario
    Dado que el usuario ingrese a la pagina de orange
    Cuando realice login
      | Usuario  | Contraseña  |
      | <Usuario> | <Contraseña> |
    Y busque el usuario "<EmployeeName>", "<NuevoUsuario>"
   Entonces modificara los datos del usuario "<NuevoUsuario>", "<EmployeeName>"

    Ejemplos:
      | Usuario  | Contraseña | EmployeeName | NuevoUsuario |
      | Admin    | admin123   |              | Admin   |



  @ModificarEliminarUsuario
  Esquema del escenario: Modificar y eliminar un usuario en OrangeHRM
    Dado que el usuario ingrese a la pagina de orange
    Cuando realice login
      | Usuario  | Contraseña  |
      | <Usuario> | <Contraseña> |

    Y busque el usuario "<EmployeeName>", "<NuevoUsuario>"
    Entonces eliminara el usuario

    Ejemplos:
      | Usuario  | Contraseña | EmployeeName | NuevoUsuario |
      | Admin    | admin123   | FName LName  | ae213        |


