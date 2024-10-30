Feature: As a user, I should be able to add a link in a message

  Background:User is already on the login page

@Wip
  Scenario Outline: User adds a link to a message
    When user logs in as "<userType>"
    And the user is on the message tab
    When the user clicks on the link tab option
    And the user enters "<text>" in the text input
    And the user enters "<url>" in the link url input
    And the user clicks the save button
    Then the user should see the link text added
    Examples:
      | userType  | text   | url                   |
      | hr        | google | https://www.google.com |
      | helpdesk  | amazon | https://www.amazon.com |
      | marketing | etsy   | https://www.etsy.com   |

  Scenario Outline: Navigate to the correct URL
    Given user logs in as "<userType>"
    When the user is on the home page
    And the user clicks on the textLink
    Then the user navigates to the correct URL
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Link opens in a new tab
    Given user logs in as "<userType>"
    And the user is on the home page
    When the user clicks on the textLink
    Then the user should see the URL opens in a new tab
    Examples:
      | userType  |
      | helpdesk  |
      | marketing |

