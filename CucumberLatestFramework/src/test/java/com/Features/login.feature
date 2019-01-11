Feature: login in to the freecrm.com

Scenario: Submit valid data via login form
	Given user is on login page
	When user enters username and password
	When user clicks submit button
	And user is on home page