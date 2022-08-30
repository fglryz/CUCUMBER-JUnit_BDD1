
Feature: to test signup feature
Background:
  Given User navigates to url
  Then User sees "Signup/Login' button successfully

  Scenario:Login User with correct email and password
    Given User Clicks on 'Sign Up' button
    When User fills the Name box
    And User fills the Email Address
    When User clicks the signup button
    Then User sees the ENTER ACCOUNT INFORMATION text





