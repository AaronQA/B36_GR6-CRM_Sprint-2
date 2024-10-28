Feature: Upload files and pictures Functions

  @wip
  Scenario: Upload a file
    Given I am on the Upload File page
    When I upload a file named test.txt
    And I click the Upload button
    Then I should see "File uploaded successfully