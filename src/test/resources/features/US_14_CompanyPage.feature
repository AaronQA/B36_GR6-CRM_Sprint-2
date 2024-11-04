Feature: As a user, I should be able to access to the Company page.

  Background: User is already on the login page
    Given user is on the login page

  Scenario Outline: Verify that the user can see the following modules on the Company page shown as design.
    When user logs in as "<userType>"
    And user navigates to the "Company" page
    Then user should see below modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify that the user can see the following modules on the Company page shown as design
  when user log out.
    When user logs in as "<userType>"
    And user navigates to the "Company" page
    And user logs out
    And user logs in as "<userType>" again
    And user navigates to the "Company" page
    Then user should see below modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify that the user can see the following modules on the Company page shown as design
  when user clicks on different pages and clicks back on Company page.
    When user logs in as "<userType>"
    And user navigates to the "Company" page
    And user clicks on Drive, Calendar and Time and Reports
    And user navigates to the "Company" page
    And user navigates to the "Active Stream" page
    And user navigates to the "Tasks" page
    And user navigates to the "Workgroups" page
    And user navigates to the "Drive" page
    And user navigates to the "Calendar" page
    And user navigates to the "Mail" page
    And user navigates to the "Contact Center" page
    And user navigates to the "Time and Reports" page
    And user navigates to the "Employees" page
    And user navigates to the "Services" page
    And user navigates to the "Company" page
    Then user should see below modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: Verify that the user can see the following modules on the Company page shown as design
  when user clicks on different modules on Company page.
    When user logs in as "<userType>"
    And user navigates to the "Company" page
    And user navigates to the "Official Information" module
    And user navigates to the "Our Life" module
    And user navigates to the "About Company" module
    And user navigates to the "Photo Gallery" module
    And user navigates to the "Video" module
    And user navigates to the "Career" module
    And user navigates to the "Business News (RSS)" module
    And user navigates to the "More" module
    And user navigates to the "Official Information" module
    Then user should see below modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
