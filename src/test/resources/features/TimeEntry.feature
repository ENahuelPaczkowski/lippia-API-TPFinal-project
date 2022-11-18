Feature: Time entry

  Background:
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And obtengo mi userId
    And obtengo mi workspace
  @Nahuel
  Scenario Outline: Consultar horas registradas exitoso
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then obtengo las horas registradas
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | TIMEENTRY | timeEntry/rq | 200    |

  @Nahuel
  Scenario Outline: Consultar horas registradas erroneo
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity | jsonName         | status |
      | GET       | ERROR  | timeEntry/rq_403 | 403    |

#  Scenario Outline: Consultar horas registradas erroneo por user id
#    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
#    And se obtuvo el status code <status>
#    Then se obtuvo el response esperado en <entity> con el <response>
#
#    Examples:
#      | operation | entity | jsonName         | response         | status |
#      | GET       | ERROR  | timeEntry/rq_400 | timeEntry/rs_400 | 400    |

  Scenario Outline: Agregar horas a un projecto
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then obtengo las horas registradas
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | TIMEENTRY | timeEntry/rq | 200    |