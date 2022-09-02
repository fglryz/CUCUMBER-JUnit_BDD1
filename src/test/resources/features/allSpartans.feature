@wip
Feature:Verify all spartans
  Scenario: Retrieve all spartans via API
    When API get request is made to endpoint "http://54.91.11.180:8000/api/spartans"
    Then verify status code is 200
    And Verify response content type is "application/json"
    When print out the response  body to the console
    And Print out the user's id
    And Print out the user's name
    And Print out the user's gender

    Scenario






