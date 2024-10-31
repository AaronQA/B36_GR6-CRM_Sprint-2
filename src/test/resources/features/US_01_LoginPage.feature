Feature: As a user, I should be able to login.

  Background: User is already on the login page
    Given user is on the login page


  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login.
    When user logs in as "<userType>"
    Then user should be able to see "Portal" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify that "Incorrect login or password" error message is displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials.
    When user logs in with "<wrong username>" or "<wrong password>"
    Then error message "Incorrect login or password" should be displayed
    Examples:
      | wrong username          | wrong password   |
      | wrongUsername           | wrongPassword    |
      | marketing16@cydeo.com   | wrong password   |
      | wrong username          | wrong password   |
      | helpdesk16@cydeo.com    | @                |
      | marketing16@cydeo.com   | .                |
      | wrongUsername@gmail.com | UserUSer         |
      | hr16@cydeo.com          | 1234UserUse      |
      | Wrong12_@gmail.com      | UserUser 123 !@# |

  Scenario Outline: Verify that the "Please fill out this field" error message is displayed
  if the password or username is empty.
    When user logs in with "<empty username>" or "<empty password>"
    Then error message "Please fill out this field" should be displayed
    Examples:
      | empty username        | empty password   |
      |                       | wrongPassword    |
      | marketing16@cydeo.com |                  |
      |                       |                  |
      | helpdesk16@cydeo.com  |                  |
      |                       | UserUSer         |
      | hr16@cydeo.com        |                  |
      |                       | UserUser 123 !@# |

    @wip
  Scenario: Verify that the "Remember me on this computer" link exists
  and is clickable on the login page.
    When user clicks on Remember me on this computer
    Then user should be able to see checkbox is clicked
