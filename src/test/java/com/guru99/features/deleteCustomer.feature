Feature: Delete customer details
  As a manager
  I want to delete customers

  Scenario Outline: Manager can delete a customer

    Given I navigate to guru homePage

    When  I enter a valid user ID as “<userID>”

    And   I enter valid password as “<userPass>”

    And   I click on the login button

    And   I click on edit customer link

    And   I enter customer id as “<CustomerId>”

    And   I click on submit button

    And   I click on  ok button on the popUpMessage window

    Then  customer is deleted and confirmation is dispalyed as “<deletionMeassage>“

    And   I click on ok button

    And   I click on logout button

    And   I click ok on popUpMessage

    Examples:

      | userID         | userPass        | CustomerId | deletionMeassage                      |
      | mngr265737     |   qAqYzug       |            | Customer deleted Successfully         |

