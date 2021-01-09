#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Llenar los campos de busqueda de vacante y uso del boton
  Un usuario accede a la seccion de Empleos donde puede hacer busqueda
  de vacantes basado en lo que coloque en los campos de textos

  @CamposExito
  Scenario: Accionamiento del boton de busqueda
    Given Cuando el usuario este en la direccion de la pagina
    And Dentro de la sección de Empleos
    When Llena los campos de busqueda de vacantes
    Then Dar click sobre el boton de busqueda y valida lo filtrado

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
