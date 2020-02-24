Feature: Registration in TestmeApp
Scenario Outline: Successful registration
    Given access the URL
    When user enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirm password>" , "<gender>" , "<email>" , "<mobilenumber>" , "<dob>" , "<address>" , "<securityquestion>" , "<answer>"
    Then click on submit button
    Examples: 
      | username | firstname | lastname | password | confirm password | gender | email                  | mobilenumber | dob        | address        | securityquestion        | answer |
      | santhi   | santhi    | gutti    | prashu23 | prashu23         | Female | santhi.gutti@gmail.com |   1234567890 | 18/11/1996 | andhra pradesh | what is your plant name | chinnu |
