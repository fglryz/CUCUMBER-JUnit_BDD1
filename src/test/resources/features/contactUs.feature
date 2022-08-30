
Feature:Test Contact Us feature
  Background:
    Given User navigates to url
    Then User sees "Signup/Login' button successfully
    Given User Clicks on 'Sign Up' button
    When User fills email box
    When User fills the password
    When User clicks tke login button

  Scenario:
  When User clicks on 'Contact Us' button
  Then User sees the  'GET IN TOUCH' is visible
  When User enters name, email, subject and message
  When User uploads files
  And User clicks 'Submit' button
  When User clicks OK button
  Then User sees success message 'Success! Your details have been submitted successfully.' is visible
