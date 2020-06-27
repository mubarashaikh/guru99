Feature: balance enquire

  As a manager
  I want to enquire customer balance

  Scenario Outline: Manager can make balance enquiry

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on balance enquiry button
    And   I enter account no as “<accountNO>”
    And   I click on the submit button
    Then  I verify account no as “<accountNO>”
    And   I verify Type of Account “<accountType>”
    And   I verify  balance as   “<balance>”
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message

    Examples:
      | userID    | password | accountNO | accountType | balance |
      | mngr265737| qAqYzug  |           |             |         |