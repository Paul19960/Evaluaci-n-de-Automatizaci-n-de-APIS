Feature: PetStore API

  @crearOrder
  Scenario Outline: Crear Order

    Given la url es <urlBase>
    When creo el order con <idOrder> con <idPET> con <quantity>
    Then valido el codigo de respuesta sea 200

    Examples:

      | urlBase                           | idOrder | idPET | quantity |
      | "https://petstore.swagger.io/v2/" | 30      | 50    | 3        |
      | "https://petstore.swagger.io/v2/" | 40      | 51    | 2        |
      | "https://petstore.swagger.io/v2/" | 50      | 52    | 1        |
      | "https://petstore.swagger.io/v2/" | 60      | 53    | 4        |


  @consultaOrder
  Scenario: Consultar Order

    Given la url es "https://petstore.swagger.io/v2/"
    When consulto el order con IDORDER "30"
    Then valido el codigo de respuesta sea 200
    And valido el id de la mascota sea "50";


