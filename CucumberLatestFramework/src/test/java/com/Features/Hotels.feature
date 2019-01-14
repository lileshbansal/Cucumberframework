@SmokeTest
Feature: check hotel search

Background:
Given user is on login page
When user enters username and password
|username|password|
|lileshbansal@gmail.com|shiva@1528|
Then user clicks submit button



Scenario: click on Hotels page
Given user is on hotels page
Then click on Hotels icon
Then click on search 