Feature: As a user, I should be able to login.

  Background: User is already on the login page
    Given user is on the login page
@USAC1
  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login.
    When user logs in as "<userType>"
    Then user should be able to see "Portal" as page title

    Then user should be able to upload

    Examples:
      | userType  |
      | hr        |
      #| helpdesk  |
     #| marketing |
#
#  @USAC2
#  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
#  successful login.
#    When user logs in as "<userType>"
#    Then user should be able to see "Portal" as page title
#
#    Then user should be able to upload
#
#
#
#    Examples:
#      | userType  |
#      | hr        |
#      #| helpdesk  |
#     # | marketing |
