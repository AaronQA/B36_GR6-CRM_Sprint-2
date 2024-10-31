Feature: Upload files and pictures Functions

  @wip
  Scenario: Upload files and pictures
    Given user is on the login page
    Given user logs in as "hr"

    Given User can upload files and pictures
    When user can insert the files and images into the text
    And user can remove files and images into the text