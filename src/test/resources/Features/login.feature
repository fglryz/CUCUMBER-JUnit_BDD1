
Feature: As a user, I should be able to login, so that I can land on homepage.

  @wip
     Scenario Outline: User should be able to login with  Valid Credentials
     Given User navigate  the url
     When  User enters "<Valid Username>"
     When  User fills "<Valid Password>"
     When User clicks Log In button
     Then User sees Activity Stream on home page

     Examples:
     |Valid Username                              | Valid Password|
     |  helpdesk1@cybertekschool.com              |  UserUser      |
     |  hr1@cybertekschool.com                    | UserUser       |



    Scenario Outline: User should be able to login  with Invalid Credentials
      Given User navigate  the url
      When User enters "<Invalid Username>"
      When User fills "<Invalid Password>"
      When User clicks Log In button
      Then User sees "Incorrect login or password"
      Examples:
        |Invalid Username                              |  Invalid Password |
        |   helpdesk1@cybertek3.com                     |     UserUser123   |
        |   hr1@cybertekschooll.com                     |    useruser2      |



