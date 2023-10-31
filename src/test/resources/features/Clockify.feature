Feature: Como usuario deseo poder agregar tiempos en mis proyectos

  @Clockify
  Scenario Outline: Agregar tiempo en un proyecto
    Given el usuario ingreso a la app correctamente
    When el usuario ingresa su <email>, <password>
    And el usuario setea una hora <hora> <minutos>
    And el ususario agrega al proyecto <project> y descripcion <texto>
    And el usuario guarda el time entry
    Then el usuario verifica su proyecto <texto> guardado

    Examples:
      | email             | password  | texto   | project | hora | minutos |
      | xnahuex@gmail.com | Asdasd123 | crowdar | Mobile  | 14   | 15      |