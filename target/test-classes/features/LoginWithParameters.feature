@smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background: Assuming user is on the login page
    Given user is on the login page


  Scenario Outline: Login as librarian
    When user enters username "<librarian username>"
    And user enters password "<librarian password>"
    Then user should see the dashboard

    Examples:
      | librarian username  | librarian password |
      | librarian43@library | libraryUser        |


  Scenario Outline: Login as student
    When user enters username "<student username>"
    And user enters password "<student password>"
    Then user should see the dashboard

    Examples:
      | student username | student password |
      | student5@library | libraryUser      |


  Scenario Outline: Login as librarian
    When user enters username "<librarian username>" and password "<librarian password>"
    Then user should see the dashboard

    Examples:
      | librarian username  | librarian password |
      | librarian43@library | libraryUser        |
  @wip
  Scenario Outline: Login as student
    When user enters username "<student username>" and password "<student password>"
    Then user should see the dashboard

    Examples:
      | student username | student password |
      | student5@library | libraryUser      |