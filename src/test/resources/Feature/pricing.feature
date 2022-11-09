@tag
Feature: features of pricing page

  @tag1
  Scenario: test of datocms logo
  	Given user is on the pricing page of Datocms
  	When user clicks on datocms logo
  	Then user is redirected to the homepage of datocms
  	
  Scenario: test of Agency partner program link
    Given user is on the pricing page of Datocms
    When user clicks on agency partner program link
    Then you are on the partners page of datocms
    
   Scenario: test of compare limits and feature details button
   	Given user is on the pricing page of Datocms
   	When user clicks on compare limits and feature details button
   	Then user redirects to full comparison page
   	
   Scenario: verification of tore hiemann image
   	Given user is on the pricing page of Datocms
   	When user scroll down the pricing page
   	Then image should be visible on the page
   	
   Scenario: verification of privacy policy links
   	Given user is on the pricing page of Datocms
   	When user scroll downs to the bottom of the page
   	And user clicks on privacy policy link
   	Then user is on privacy policy page