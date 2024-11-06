Feature: As a user, I should be able to add a link in a message

  Background:User is already on the login page


  @Asma
  Scenario Outline: Verify <userType> is able adds a link to a message
    When user logs in as "<userType>"
    And the user is on the message tab
    And the user clicks on the link tab option
    And the user enters "<url>" in the link url input
    And the user clicks the save button
    And the user clicks on the send button
    Then the user should see the linkText added
    Examples:
      | userType  | url                    |
      | hr        | https://www.amazon.com |
      | hr        | https://www.cydeo.com  |
      | hr        | https://www.etsy.com   |
      | helpdesk  | https://www.amazon.com |
      | helpdesk  | https://www.cydeo.com  |
      | helpdesk  | https://www.etsy.com   |
      | marketing | https://www.amazon.com |
      | marketing | https://www.cydeo.com  |
      | marketing | https://www.etsy.com   |

@Wip
  Scenario Outline: Verify <userType> is able to navigate to the correct URL
    Given user logs in as "<userType>"
    When the user is on home page
    And the user clicks on the textLink
    Then the user navigates to the correct url
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

@wip2
  Scenario Outline: Verify <userType> is able to open url in new tab
    Given user logs in as "<userType>"
    When the user is on home page
    And  the user clicks on the textLink
    Then the user should see the link opens in a new tab
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


