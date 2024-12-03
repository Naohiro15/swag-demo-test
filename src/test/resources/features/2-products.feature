@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras

  Background: Realizar 1 validacion en el carrito de compra
    Given el usuario navega al sitio web
    When ingresa credenciales validas

    @ShoppingCartList
    Scenario: 1 - Listar los productos en el carrito de compras
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      Then el sistema deberia listar los productos agregados en el carrito de compras