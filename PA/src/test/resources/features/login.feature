
Feature: Prueba de login gmail


  Scenario: Login OK
    Given ingreso a www.gmail.com
    And ingreso mi correo electronico
    When presiono al boton siguiente
    Then muestra opcion de ingreso de contraseña
    And check more outcomes


  
