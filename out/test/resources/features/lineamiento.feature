#language: es
Característica:.

  Antecedentes:
    Dado el usuario accede a la pagina
    Cuando el usuario ingresa su usuario aj.cotesbarrozo@tcs.com y contraseña Amen981#


  @Lineamiento
  Esquema del escenario: Crear Un lineamiento
    Dado Ingresa a la lista desplegable de Parametrización y Lineamientos
    Cuando Ingreso a Lineamientos deseo ver el flujo de Lineamientos
    Entonces Le doy click a crear lineamiento e ingreso los datos
      | Nombre           | <Nombre>           |
      | Descripcion      | <Descripcion>      |
      | TipoLineamiento  | <TipoLineamiento>  |
      | ValorLineamiento | <ValorLineamiento> |
      | TipoDeAfectacion | <TipoDeAfectacion> |
      | Estado           | <Estado>           |
      | FechaInicio      | <FechaInicio>      |
      | FechaFin         | <FechaFin>         |
      | FechaLimite      | <FechaLimite>      |


    Y Valido que se haya creado correctamente
    Ejemplos:
      | Nombre              | Descripcion         | TipoLineamiento | ValorLineamiento | TipoDeAfectacion | Estado | FechaInicio | FechaFin   | FechaLimite |
      | Prueba Automatizada | Prueba Automatizada | monto           | 10                | Incrementa       | activo | 02/02/2023  | 02/02/2024 | 02/05/2024  |


