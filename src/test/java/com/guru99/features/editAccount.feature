Feature: Edit Account
  As a manager
  I want to edit customer account



Scenario Outline: As a bank manager I can edit customer bank account

    Given  I navigate to guru homePage
    When   I enter a valid userId as “<userId>”
    And    I enter a valid password as “<Password>“
    And    I click on the login botton
    And    I click on edit account botton
    And    I enter account No as “<AccNO>“
    And    I click on the submit botton
    And    I click on TypeOfAccount
    And    I select account type as “<Current>”
    And    I click on the submit botton
    Then   account updated message is displayed as “<Message>“
    And    I click on continue botton
    And    I click on logout button
    And    I click ok on the popUpMessage

  Examples:
    | userId    | Password | AccNO | Current | Message |
    | mngr265737| qAqYzug  |       |         |         |