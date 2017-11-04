Feature: New customer Registration and Login

  @Register
  Scenario: New customer registration
    Given I am navigating to Tesco website
    And  I am going to Registration page
    When i enter new user details and findout address
    And I create new user
    Then I verify account and signout successfully

  @Login
  Scenario: User ValidLogin account and Logout
    Given I am navigating to Tesco website
    And I enter Username and password
    Then I verify account and logoutnout successfully

  @HomeclearancePrint
  Scenario: Printing all Home clearence items
    Given I am navigating to Tesco website
    And I enter Username and password
    When I am goto Tesco Direct page
    And I click on homeclearance
    Then I print on all homeclearance page

  @TescoDirectonlineshopping
  Scenario: Tesco direct onlie shopping with invalid cardpayment

    Given I am navigating to Tesco website
    And I enter Username and password
    And I am one item adding to the basket
    Then I enter the card details
    And I should see please use different card

