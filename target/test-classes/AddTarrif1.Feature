#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
  And click add tarrif details
  
  

  @vezha
  Scenario: Title of your scenarios
   
    
    When fill all details in 1D list
    |12345|12345|45689|32146|123|123|123|
    And click submit button
    Then validate details entered succssfully
    

  @vendan
  Scenario: Again Testing
  
    
    When fill all details in 1D map
    |customer id|123456789|
  |Monthly| 12345|
   |Free|1234|
   |Free1|45689|
   |Free_SMS|32146|
   |Local|123|
   |International|123|
   |SMS|123|
    And click submit buttons
    Then validate details entered succssfullys
    
