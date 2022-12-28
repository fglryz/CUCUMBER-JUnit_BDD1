
Feature: As a user, I should be able to create a task

  Background: For the scenarios in the feature file, user is expected to be on homepage
    Given User navigate  the url


  Scenario: User should be able to create a task with Responsible  Person
    When User clicks Task tab
    When User cleans responsible person box
    When User chooses on Responsible Person
      | hr33@cybertekschool.com |
    When User clicks the deadline box
    When User select day and click
    When User click the select button
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window



  Scenario: User should be able to create a task with responsible  person with Time planning
    When User clicks Task tab
    When User cleans responsible person box
    When User chooses on Responsible Person
      | hr99@cybertekschool.com |
    When User clicks the deadline box
    When User select day and click
    When User click the select button
    When Users clicks time planning text
    When User clicks  start task on tag
    When User select day and click
    When User click the select button
    When User clicks  finish task on tag
    When User select finish day and click
    When User click the select button
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window


  Scenario: User should be able to create a task with responsible  person with Options
    When User clicks Task tab
    When User cleans responsible person box
    When User chooses on Responsible Person
      | hr99@cybertekschool.com |
    When User clicks the deadline box
    When User select day and click
    When User click the select button
    When Users clicks Options text
    When User choses first radio button and click
    When User chooses third radio button and click
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window


  Scenario: User should be able to create a task with Participants
    When User clicks Task tab
    When User clicks Participant buttons
    When User clicks  add button on Participant text
    When User chooses on Participants
      | hr77@cybertekschool.com |
    When Users closes Pop Up Window
    When User adds more button
    When User chooses on Participants
      |  Cate Nimal             |
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window


  Scenario Outline: User should be able to create a task with Participants
    When User clicks Task tab
    When User clicks Participant buttons
    When User clicks  add button on Participant text
    When User chooses on "<Participants>"
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window
    Examples:
      | Participants                  |
      | hr77@cybertekschool.com       |
      | Cate Nimal                    |
      | helpdesk45@cybertekschool.com |



  Scenario: User should be able to create a task with Observer
    When User clicks Task tab
    When User clicks observer tab
    When User chooses on Observers
      |  Cate Nimal             |
    When User writes the "CPD" on message box
    When User clicks Send button at Messages Tab
    Then User sees the "Task has been created" window

  Scenario: User should be able to see warning text when not to writes text on o message box
    When User clicks Task tab
    When User cleans responsible person box
    When User chooses on Responsible Person
      | hr33@cybertekschool.com |
    When User clicks the deadline box
    When User select day and click
    When User click the select button
    When User  blanks  message box
    When User clicks Send button at Messages Tab
    Then User sees the  warning text "The task name is not specified."


