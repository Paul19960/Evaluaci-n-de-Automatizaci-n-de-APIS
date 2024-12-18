Feature: Test Assertion

  @TestAssertion
  Scenario Outline: prueba de login exitoso
    Given prueba de assertion
    When pruebo un servicio url "http://www.google.com"
    When inicio de sesion con "<usuario>" y "<password>"

    Examples:
      | usuario   | password                      | url         |
      | jackl007  | Peru2020                      | google.com  |
      | monica008 | egresadadelsenaticonvalidando | nttdata.com |