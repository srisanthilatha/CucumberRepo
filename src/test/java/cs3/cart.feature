Feature: view cart in TestMeApp

  Scenario: view cart
    Given user login to TestMeApp
    When searches a product
    Then proceed to pay
