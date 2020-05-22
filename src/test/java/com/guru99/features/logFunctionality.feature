Feature: user credentials

  as a customer
  i want the ability to successfully login into guru99 website

  # SS1 User can lgoin with valid userID and valid password

  Scenario: access to application is granted with valid user Id and valid password

    Given i navigate to guru homePage
    When i enter valid user id as "mngr26q1507"
    And i enter valid password as "jAjEmEd"
    And I click on login button
    Then Application access is granted and MANAGER PAGE Title message is displayed as "Guru99 Bank"






#    # SS2 User cannot lgoin with invalid userID and valid password
#  Scenario: access to application is not granted with invalid user Id and valid password
#    Given i navigate to guru homePage
#    When i enter invalid user id as "mngr261507-Invalid"
#    And i enter valid password as "jAjEmEd"
#    And I click on login button
#    Then Application access is not granted and pop-up error correct message is displayed as "User or Password is not valid"
#
## SS3 User cannot lgoin with valid userID and invalid password
#  Scenario: access to application is not granted with valid user Id and invalid password
#    Given i navigate to guru homePage
#    When i enter valid user id as "mngr261507"
#    And i enter invalid password as "jAjEmEd-Invalid"
#    And I click on login button
#    Then Application access is not granted and correct message is displayed as "User or Password is not valid"
#
## SS4 User cannot lgoin with invalid userID and Invalid password
#  Scenario: access to application is not granted with invalid user Id and valid password
#    Given i navigate to guru homePage
#    When i enter invalid user id as "mngr261507-Invalid"
#    And i enter invalid password as "jAjEmEd-Invalid"
#    And I click on login button
#    Then Application access is not granted and correct message is displayed as "User or Password is not valid"


