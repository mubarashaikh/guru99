Feature: delete account
  As a manager
  I want to delete a customer account

  Scenario Outline: as a manager i can delete customer account

    When  I enter a valid user ID as “<user ID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on delete account
    And   I enter account No as “<accountNO>”
    And   I click on submit botton
    Then  account deleted message is displayed as “<Message>”
    And   I click on logut button
    And   I click ok on popUp message


    Examples:
      | user ID   | password | accountNO | Message |
      | mngr265737|   qAqYzug|           |         |