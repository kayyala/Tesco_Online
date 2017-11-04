Feature: Customer doing online shopping

  @Onlineshopping
  Scenario: Online shopping
    Given I am going to groceries and baby milk
    When I check my full basket and Book delivery slot
    Then I reserved time and continue to ordersummry
    And I enter my full card details and confirm payment

  @Basket
  Scenario: checking FullBasket
    Given I am navigating to Tesco website
    And I enter Username and password
    Given I am going view fullbasket
    When I am checking howmany items in my baskets
    Then I am delete some items and update in my beskets

    @Checkgrocerylist
    Scenario: checking grocery list
      Given I am navigating to Tesco website
      And I enter Username and password
      When I click on grocerylist
      Then It will print all grocery list
