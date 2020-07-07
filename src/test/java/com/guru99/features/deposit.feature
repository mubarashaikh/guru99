Feature: deposit

  As a manager
  I want to deposit money

    Background:

      Given i navigate to guru HomePage
      When I enter vaild user ID as "mngr265737"
      And i enter valid password as "qAqYzug"
      And i click on login button
###################################################################

   @AcceptanceTest
#   @ignore
  Scenario Outline: Manager  can deposit into customer account

    And   I click on deposit button
    And   I enter account no as “<accountNO>”
    And   I enter amount as “<Amount>”
    And   I enter deposit description as “<Description>”
    And   I click on submitButton
    Then  verify accountNo as "<accountNo>"
    And   verify amount credited as "<amountCredited>"
    And   verify type of transaction as "<TransType>"
    And   verify deposit description as "<depositDescription>"
    And   I click on continueButton
    And   I click on logout


    Examples:
     | accountNO | Amount  | Description | accountNo  | amountCredited | TransType | depositDescription |
     |    80551  |  2300   |  "salary"   | 80551      |   2300         | Deposit   | salary           |



