@wip
Feature: As a user, I should be able to login, so that I can land on homepage.


   Background:
     Given User navigate the the url
   Scenario Outline: User should be able to login with  Valid Credentials
     Given User navigate the the url
     When  User enters "<Valid Username>"
     When  User fills "<Valid Password>"

     Examples:
     |Valid Username                              |  Valid Password|
     |  helpdesk1@cybertekschool.com              |     UserUser   |

     When User clicks Log In button
     Then User sees Activity Stream on home page


    Scenario Outline: User should be able to login  with Invalid Credentials
      When User enters "<Invalid Username>"
      When User fills "<Invalid Password>"

      Examples:
        |Invalid Username                              |  Invalid Password|
        |  helpdesk1@cybertek3.com                     |     UserUser123   |
         |   fgl@gmail.com                             |       F12321A           |
      When User clicks Log In button
      Then User sees "Incorrect login or password"



