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
Feature: Testing Bukalapak

  @tag1
  Scenario: Test Login
    Given open firefox
    When I input valid email and password
    Then I can login successfully
 
	@tag2
	Scenario: Test Register
    Given open firefox
    When I input valid email or telephone number
    Then I click register button
    When I filled out the form
    Then I have registered 