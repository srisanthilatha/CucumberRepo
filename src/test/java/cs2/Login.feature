Feature: login feature

  Scenario Outline: successful login
    Given i enter username
    When enters "<username>" , "<password>"
    Then click on login button

    Examples: 
      | username | password    |
      | Lalitha  | password123 |
