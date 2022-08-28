@wip
Feature: Account information feature
  Background:
    Given User navigates to url
    Then User sees "Signup/Login' button successfully
    Given User Clicks on 'Sign Up' button
    When User fills the Name box
    And User fills the Email Address
    When User clics the signup button
    Then User sees the ENTER ACCOUNT INFORMATION text
  Scenario:To complete account information page
    When User click on Mrs checkbox
    When User writes password on password box
    When User selects day
    When User selects month
    And User selects year
    When User ticks the newsletters
    When User ticks the special offers button
    When User fills the first name box
    When User fills the last name box
    And User fills the company box
    When User fills address1 box
    When User fills address2 box
    And User selects the country from country select
    When User fills the state box
    When User fills the city box
    And User  fills the zipcode box
    When User fiils mobile number
    When User clicks create account box


