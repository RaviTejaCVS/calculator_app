#Author: Ravi Teja
@AdditionTest
Feature: Verify Addition Functionality


Background: I landed in Calculator Web Application

	@PositiveNumbersAddTest
  Scenario Outline: Test Addition of Positive Numbers
    Given I want to "Add two positive numbers"
    When I enter the first number <number1>
    Then I click the "+" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|7      |
      
   @NegativeNumbersAddTest
  Scenario Outline: Test Addition of Positive Numbers
    Given I want to "Add two positive numbers"
    Then I click the "-" button
    When I enter the first number <number1>
    Then I click the "+" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|-7      |
      
      
       @PositiveNegativeNumbersAddTest
  Scenario Outline: Test Addition of Positive Numbers
    Given I want to "subtract two positive numbers"
    When I enter the first number <number1>
    Then I click the "+" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 7     	|-1     |
    
    @DecimalNumbersAddTest
  Scenario Outline: Test Addition of Positive Numbers
    Given I want to "Add two positive numbers"
    When I enter the first number <number1>
    Then I click the "." button
     When I enter the first number <number1>
    Then I click the "+" button
     And I enter the second number <number2>
    Then I click the "." button
     And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|7.7      |