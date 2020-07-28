Feature: customise statement

  As a manager
  I want to customise customer bank statement

    Background:

    Given i navigate to guru HomePage
    When I enter vaild user ID as "mngr272831"
    And i enter valid password as "YqEdutU"
    And i click on login button
#####################################################

#  @AcceptanceTest
  @ignore
  Scenario Outline: Manager can customise bank statement

    And   I click on customised statement
    And   I enter account num as “<account NO>”
    And   I enter from date as “<From Date>”
    And   I enter  to date as “<To Date>”
    And   I enter  minimum transaction as “<minTransasctionValue>”
    And   I enter number of transaction as   “<NumOfTransactions>”
    And   I click on submit button
    Then  the customised statement for  “<account>” is displayed
    And   I click on continue button
    And   I click logout buttton

#    need double quotation in account to make a single variable of type String
    Examples:
     | account NO | From Date | To Date   | minTransasctionValue | NumOfTransactions | account                                                                         |
     | 80551      | 13/05/2020| 07/07/2020| 0                    |                  7| "Transaction Details for Account No: 80551 from Date: 2020-05-13 to: 2020-07-07"|