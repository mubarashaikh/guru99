Feature: withdrawl cash

  As a manager
  I want to withdraw cash for customers

  Scenario Outline: Manager  can withdraw cash

    Given I navigate to guru homePage
    When  I enter a valid user ID as “<userID>”
    And   I enter valid password as “<password>”
    And   I click on the login button
    And   I click on withdrawal button
    And   I enter account no as “<accountNO>”
    And   I enter amount as “<Amount>”
    And   I enter deposit as “<Description>”
    And   I click on submit button
    Then  verify accountNo as "<accountNo>"
    And   verify Amount Debited  as "<Amount Debited>"
    And   verify type of transaction as "<TransType>"
    And   verify deposit description as "<depositDescription>"
    And   I click on continue button
    And   I click on logout
    And   I click ok on popUp message

    Examples:

      | userID    | password| accountNO | Amount | Description | accountNo | Amount Debited | TransType   | depositDescription |
      | mngr265737| qAqYzug |           | 230    | bill        |           |   230          |   Withdrawal| loan               |


