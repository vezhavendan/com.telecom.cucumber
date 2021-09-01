#Author: your.email@your.domain.com

#Feature: List of scenarios.

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given launch telecom website 
    And click add customer details
    When fill all details in repective box
    And click submit
    Then check customer id is generated
  

