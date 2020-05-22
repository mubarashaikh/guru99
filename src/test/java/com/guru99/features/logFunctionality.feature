Feature: user credentials

  as a customer
  i want the ability to loging in to website

###########################
 # implementing SS1

#  Scenario: User can successfully login with valid user ID and password
#
#    Given i navigate to guru HomePage
#    When I enter vaild user ID as "mngr261507"
#    And i enter valid password as "jAjEmEd"
#    And i click on login button
#    Then user is successfully logged in and manger page title is displayed as "Guru99 Bank"


#######################
   #implementing SS2

#  Scenario: User can not login with invalid user ID and valid password
#
#   Given i navigate to guru HomePage
#    When I enter invaild user ID as "Invalid-r2615"
#    And i enter valid password as "jAjEmEd"
#    And i click on login button
#    Then accesss is not garnted and error message is displayed as "User or Password is not valid"

########################
  # implementing SS3

#  Scenario: User can't login with valid user ID and invalid password
#
#    Given i navigate to guru HomePage
#    When I enter vaild user ID as "mngr261507"
#    And i enter invalid password as "invalidPass"
#    And i click on login button on homePage
#    Then accesss is not garnted and error message is displayed as "User or Password is not valid"

###########################
  #  implementing SS4

#  Scenario: User can't login with invalid user ID and password
#
#    Given i navigate to guru HomePage
#    When I enter invaild user ID as "Invalid-r2615"
#    And i enter invalid password as "invalidPass"
#    And i click on login button
#    Then accesss is not garnted and error message is displayed as "User or Password is not valid"

##########################
  #  implementing SS5

  Scenario: verify manager Id after successfly logined

    Given i navigate to guru HomePage
    When I enter vaild user ID as "mngr261507"
    And i enter valid password as "jAjEmEd"
    And i click on login button
    Then user is successfully logged in and manger ID should be dispalyed as "Manger Id : mngr261507"