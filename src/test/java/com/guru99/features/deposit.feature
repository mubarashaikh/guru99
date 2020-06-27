Feature: deposit

  As a manager
  I want to deposit money

  Scenario Outline: Manager  can deposit into customer account

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on deposit button
    And   I enter account no as “<accountNO>”
    And   I enter amount as “<Amount>”
    And   I enter deposit as “<Description>”
    And   I click on submit button
    Then  verify accountNo as "<accountNo>"
    And   verify amount credited as "<amountCredited>"
    And   verify type of transaction as "<TransType>"
    And   verify deposit description as "<depositDescription>"
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message

    Examples:
      | userID     | password | accountNO | Amount  | Description | accountNo | amountCredited | TransType | depositDescription |
      |  mngr265737| qAqYzug  |           |  2300   |  salary     |           |   2300         | Deposit   | salary             |



