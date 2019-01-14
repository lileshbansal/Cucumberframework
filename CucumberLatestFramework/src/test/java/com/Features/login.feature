@SmokeTest
Feature: login in to the makemytrip.com

Background:
Given user is on login page
When user enters username and password
|username|password|
|lileshbansal@gmail.com|shiva@1528|
Then user clicks submit button



Scenario: click on Hotels page
Then click on Hotels icon

Scenario: click on Holidays page
Then click on Holidays icon  