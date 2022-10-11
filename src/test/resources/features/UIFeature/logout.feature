Feature:test logout feature
  Background:
    Given User navigates to url
    Then User sees "Signup/Login' button successfully
    Given User Clicks on 'Sign Up' button
    When User fills email box
    When User fills the password
    When User clicks tke login button

  Scenario: To test logout
    When User clicks the logout button
    Then User sees the login page

