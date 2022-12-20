
Feature: As a user ,I should be able create pool
Background:
  Given User navigate  the url
  @smoke
  Scenario: User should be able to create pool with four choices
    When User clicks Pool Tab
    When User writes first Question
    And User writes the first answer
    When User writes the second answer
    When User writes the third answer
    When User writes the fourth answer
    When User writes the "Automation Tester Interview Questions" on poolBox
    When User clicks Send button at under add questions
    Then User sees the Automation Tester Interview Questions on the home page