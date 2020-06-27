Feature: Edit customer details
  As a manager
  I want to edit customer details


Scenario Outline: Manager is able to edit existing customer details

  Given I navigate to guru homePage

  When  I enter a valid user ID as “<userId>”

  And   I enter valid password as “<password>”

  And   I click on the login button

  And   I click on edit customer link

  And   I enter customer id as “<CustomerId>”

  And   I click on submit button

  And   I enter Customer name as "<CustomerName>"

  And   I enter Gender as "<Gender>"

  And   I enter date of birth as "<DOB>"

  And   I enter address as "<Address>"

  And   I enter city as "<City>"

  And   I enter state as "<State>"

  And   I enter pin as "<Pin>"

  And   I enter mobile as "<Mobile>"

  And   I enter email as "<Email>"

  And   I click on submit Button

  Then  confirmation massage is dispalyed as “<confirmationMessage>“

  And   I click on logout button

  And   I click ok on the popUpMessage

  Examples:

    | userId         | password    | CustomerId| CustomerName| Gender| DOB        | Address                              | City      | State       | Pin       | Mobile      | Email                  | confirmationMessage                    |

    | mngr265737     | qAqYzug     |           | Tom Dic     | Male  | 01/01/1990 | 26 Victoria Road, Birmingham, B23 7RL| Birmingham| West Midland| 010100103 | 07846078889 | tomdicson2020@gmail.com| Customer details updated Successfully!!!|