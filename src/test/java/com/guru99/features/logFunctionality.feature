Feature: user credentials

  as a customer
  i want the ability to successfully login into guru99 website

  Scenario: verifying user can successfully login with valid user name and password

    Given i navigate to guru99 webPage
    When enter vaild user name
    And enter valid password
    And click on login button
    Then user is logged in
