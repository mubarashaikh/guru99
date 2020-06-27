Feature: Fund transfer

  As a manager
  I want to transfer funds on behave customers

  Scenario Outline: As bank manager I can transfer funds

    Given I navigate to guru homePage
    And   I enter a valid userId as “<userId>”
    And   I enter a valid password as “<password>”
    And   I click on login button
    When  I click on funder transfer
    And   I enter Payers account no as  “<PayersAccountNum>”
    And   I enter Payees account no as “<PayeesAccountNum>”
    And   I enter Amount as   “<Amount>”
    And   I enter Description as  “<Description>”
    Then  I verify payers account no as “<PayersAccountNum>”
    And   I verify Payees account no as “<PayeesAccountNum>”
    And   I verify  Amount as   “<Amount>”
    And   I verify Description as “<Description>”
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message
    Examples:
      | userId    | password | PayersAccountNum | PayeesAccountNum | Amount | Description |
      | mngr265737| qAqYzug  |                  |                  | 230    | loan        |





