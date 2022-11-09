
@tag
Feature: login page feature

  @tag1
  Scenario: email is given but password is empty
    Given user is on login page of datocms
    When user enters email and clicks login
    Then field is required error should appear
    
   Scenario: password is given but email is not given
   	Given user is on login page of datocms
   	When user enters only password and clicks login
   	Then field is reruired under email should appear
   	
   Scenario: verification of reset password button
   	Given user is on login page of datocms
   	When user clicks on reset password
   	Then reset password frame should appear
   	
   	Scenario: verification of signup page link
   		Given user is on login page of datocms
   		When user clicks on signup page link
   		Then user should redirected to signup page
   		
   	Scenario: verification of datocms logo
   		Given user is on login page of datocms
   		When user clicks on datocms logo
   		Then user should redirected to homepage


