Feature: create new customer
  As a bank manager
  I want to create new customers

  Background:

    Given i navigate to guru HomePage
    When I enter vaild user ID as "mngr265737"
    And i enter valid password as "qAqYzug"
    And i click on login button

#######################################################

@customer

Scenario Outline: Manager is able to add new customer

##  Given i navigate to guru HomePage
##  When I enter vaild user ID as "mngr265737"
##  And i enter valid password as "qAqYzug"
##  And i click on login button
#  Given I navigate to guru homePage
#  When  I enter a valid user ID as “<userID>”
#  And   I enter valid password as “<password>”
#  And   I click on the login button

  And  I click on NewCustomer link

  And   I enter Customer name as "<CustomerName>"

  And   I enter Gender as "<Gender>"

  And   I enter date of birth as "<DOB>"

  And   I enter address as "<Address>"

  And   I enter city as "<City>"

  And   I enter state as "<State>"

  And   I enter pin as "<Pin>"

  And   I enter mobile as "<Mobile>"

  And   I enter email as "<Email>"

  And   I enter password as "<Password>"

  And   I click on submit Button

  Then  customer is added with correct message is displayed as "<registrationMessage>"

  And   I click on logout button

  And   I click ok on the popUpMessage

  Examples:
    CustomerName | Gender | DOB | Address | City | State | Pin | Mobile | Email | Password | registrationMessage |

#  Examples:
#
#    | userID    | password | CustomerName | Gender | DOB        | Address                              | City     |  State       | Pin       | Mobile     | Email              | Password | registrationMessage               |
#    | mngr265737| qAqYzug  | Tom Dic      | Male   | 01/01/1990 | 26 Victoria Road, Birmingham, B23 7RL| Birmingham| West Midland| 010100103 | 07846078888|jamal12@hotmail.com |Bham19i0  |Customer Registered Successfully!!!|
##    | mngr265737| qAqYzug  |  Dic james      | female   | 01/01/1995 | 26 Victoria Road, Birmingham, B23 7RL| Birmingham| West Midland| 010100103 | 07846078888|jamal12@hotmail.com |Bham19i0  |Customer Registered Successfully!!!|
##    | mngr265737| qAqYzug  | james jama    | female   | 01/01/1998 | 26 Victoria Road, Birmingham, B23 7RL| Birmingham| West Midland| 010100103 | 07846078888|jamal12@hotmail.com |Bham19i0  |Customer Registered Successfully!!!|