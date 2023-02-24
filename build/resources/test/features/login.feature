Feature: Ingresar a la app de presupuesto de celsia
  Como Usuario de celsia con usuario registrado
  Quiero explorar mis opciones

  @login
  Scenario Outline: Ingreso a la app con usuario valido
    Given el usuario accede a la pagina
    When el usuario ingresa su usuario <strUser> y contraseña <strPassword>
    Then el usuario deberia ver el nombre del usuario en pantalla de inicio
    * el usuario da clic en el boton salir
    Examples:
      | <strUser>                 | <StrPassword> |
      | aj.cotesbarrozo@tcs.com | Amen981#    |


