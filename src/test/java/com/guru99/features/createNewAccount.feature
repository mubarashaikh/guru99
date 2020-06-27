Feature: create new account
  As a manager
  I want to create new accounts

  Scenario Outline: Manager can add new account for new or existing customer

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<userPass>”
    And   I click on the login button
    And   I click on new account link
    And   I enter customer id as “<CustomerId>”
    And   I select account type as “<accountType>
    And   I enter initial deposit as “<deposit>
    And   I click on submit button
    Then  new account for the customer is added with confirmation as “<createAccountMeassage>“
    And   I click on ok button
    And   I click on the logout button
    And   I click ok on the popUpMessage

    Examples:
      | userID    | userPass | CustomerId | accountType | deposit | createAccountMeassage |
      | mngr265737| qAqYzug  |            |             |    230  |                       |
