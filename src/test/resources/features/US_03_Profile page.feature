Feature: "my profile page" access functionality
  User Story: As a user, I should be able to access my profile page.

#AC1
  #Positive_Scenarios
  Scenario Outline: Verify that user able to open the "My Profile" page.
    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And  user Click on the "My Profile" option
    Then user should be able to see list of options my profile

      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: The user refreshes the "My Profile" page
    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And  user Click on the "My Profile" option
    When user refreshes the page
    Then user should be able to see list of options my profile
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    #Negative_Scenarios

  Scenario Outline: Missing options on My Profile page
    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And  user Click on the "My Profile" option
    Then the user should not see all the expected options
    And the user should only see the following options:
      | General |
      | Drive   |
      | Tasks   |
    And the user should see an error message "Some profile options are unavailable. Please try again later."

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
   #AC2
  #Positive_Scenarios
  Scenario Outline:  Verify email under General tab matches user's account email
    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And  user Click on the "My Profile" option
    And user should be able to see list of options my profile

      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |
    Then user should see "<email>" as email under General tab
    And then user should see "<email>" as email under Contact information
    And then user should verify that the both emails are the same

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  Scenario Outline: Verify email under General tab matches user's account email when resizing browser window
    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And user should be able to resize the browser window
    And  user Click on the "My Profile" option
    And user should be able to see list of options my profile

      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Then user should see "<email>" as email under General tab
    And then user should see "<email>" as email under Contact information
    And then user should verify that the both emails are the same


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    #Negative_Scenarios
  Scenario Outline:  Email format that located under General tab is invalid

    Given user logs in as "<userType>"
    When user Click on the email on the right top on the home page
    And  user Click on the "My Profile" option
    And user should be able to see list of options my profile

      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Then the "email" displayed under the General tab should have an invalid format


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |