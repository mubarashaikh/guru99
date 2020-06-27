Feature: mini statement
  As a manager
  I want to create mini statement

  Scenario Outline: Manager can make balance enquiry

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on mini statement button
    And   I enter account no as “<accountNO>”
    And   I click on the submit button
    Then  last five transactions is displayed as “<transactionDetails>”
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message

    Examples:
      | userID    | password | accountNO | transactionDetails                                |
      | mngr265737| qAqYzug  |   80551   | Last FiveTransaction Details for Account No: 80551|