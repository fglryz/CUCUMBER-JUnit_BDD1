
Feature: test login feature
  Background:
    Given User navigates to url
    Then User sees "Signup/Login' button successfully
    Given User Clicks on 'Sign Up' button

  Scenario: Login with correct mail and password
    When User fills email box
    When User fills the password
    When User clicks tke login button

    Then User sees the ENTER ACCOUNT INFORMATION text
