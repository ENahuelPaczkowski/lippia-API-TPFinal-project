@TimeEntry
Feature: Time entry

  Background:
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And obtengo mi userId
    And obtengo mi workspace

  @ConsultaExitosa
  Scenario Outline: Consultar horas registradas exitoso
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then obtengo las horas registradas
    Examples:
      | operation | entity    | jsonName     | status |
      | GETS      | TIMEENTRY | timeEntry/rq | 200    |

  @ConsultaErronea
  Scenario Outline: Consultar horas registradas erroneo
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity | jsonName         | status |
      | GET       | ERROR  | timeEntry/rq_403 | 403    |

  @Editar
  Scenario Outline: Editar descripcion de entrada
    When I perform a 'GET' to 'TIMEENTRY' endpoint with the 'timeEntry/getById/rq' and ''
    And se obtuvo el status code <status>
    And se toman los datos de un entry
    And una descripcion '<desciption>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida que la descripcion fue editada '<desciption>'

    When obtengo datos originales
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity    | desciption          | jsonName            | status |
      | PUT       | TIMEENTRY | Nueva description   | timeEntry/update/rq | 200    |