Feature: customise statement

  As a manager
  I want to customise customer bank statement

  Scenario Outline: Manager can customise bank statement

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on customised statement
    And   I enter account num as “<account NO>”
    And   I enter from date as “<From Date>”
    And   I enter  to date as “<To Date>”
    And   I enter  minimum transaction as “<minTransasctionValue>”
    And   I enter number of transaction as   “<NumOfTransactions>”
    And   I click on submit button
    Then  transactions are displayed as “<transactionDetails>”
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message

    Examples:
      | userID   | password | account NO | From Date | To Date   | minTransasctionValue | NumOfTransactions | transactionDetails                                                                  |
      |mngr265737| qAqYzug  | 80551      | 2020-06-20| 2020-06-21| 0                    |                  7| Transaction Details for Account No: 80551 from Date: 2020-06-20 to: 2020-06-21 80551|