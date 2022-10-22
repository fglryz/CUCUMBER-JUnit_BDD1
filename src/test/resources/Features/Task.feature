Feature: As a user, I should be able to create a task

  Background: For the scenarios in the feature file, user is expected to be on homepage
    Given User is on homepage
    Given User navigates to messages tab
  @wip
  Scenario: User should be able to create a task with Responsible  Person
    When User clicks Task tab
    When User writes the task name on message box
    And User clicks responsible person tab
    When User adds Responsible Person
    |hr99@cybertekschool.com|
    When User sets the deadline of task
    When User click the select button
    Then User sees the "Task has been created" window



  Scenario: User should be able to create a task with responsible  person with Time planning
    When User clicks Task tab
    When User writes the task name on message box
    And User clicks responsible person tab
    When User adds Responsible Person
      |hr99@cybertekschool.com|
    When User sets the deadline of task
    When Users clicks time planning text
    When User chooses start task on
    When User enters Duration of task
    When User chooses finish of task
    Then User sees the "Task has been created" window

  Scenario: User should be able to create a task with responsible  person with Options
    When User clicks Task tab
    When User writes the task name on message box
    And User clicks responsible person tab
    When User adds Responsible Person
      |hr99@cybertekschool.com|
    When User sets the deadline of task
    When Users clicks Options text
    When User chooses an option from radio buttons
    Then User sees the "Task has been created" window


  Scenario Outline: User should be able to create a task with Participants
    When User clicks Task tab
    When User writes the task name on message box
    And User clicks responsible person tab
    When User clicks on Participant text
    When User adds  "<Participants>"
    When User sets the deadline of task
    When User click the select button
    Then User sees the "Task has been created" window
Examples:
    |Participants|
    |helpdesk1@cybertekschool.com|
    |helpdesk26@cybertekschool.com|
    |Cate Nimal|

  Scenario Outline: User should be able to create a task with Observer
    When User clicks Task tab
    When User writes the task name on message box
    And User clicks responsible person tab
    When User clicks on Observer text
    When User adds "<Observers>"
    When User sets the deadline of task
    When User clicks Send button at Task Tab
    Then User sees the "Task has been created" window
    Examples:
    |Observers                   |
    |helpdesk1@cybertekschool.com |
    |helpdesk26@cybertekschool.com|
    |Cate Nimal                   |