 @Regression
 Feature: sample test project
  Background: 
  		Given User logged into application
 

 @test1
  Scenario: LOGIN Scenario
  Given User is on login page
	When User enters username and password
	Then login is successful
