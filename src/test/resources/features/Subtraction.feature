#Author: Ravi Teja
@SubtractionTest
Feature: Verify the subtraction featuree


Background: I landed in Calculator Web Application

	@PositiveNumbersSubTest
  Scenario Outline: Test Subtraction of Positive Numbers
    Given I want to "subtract two positive numbers"
    When I enter the first number <number1>
    Then I click the "-" button
    And I enter the second number <number2>
		Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|5     |
 
 @NegativeNumbersSubTest
  Scenario Outline: Test Subtraction of Negative Numbers
    Given I want to "subtract two negative numbers"
    Then I click the "-" button
    When I enter the first number <number1>
    Then I click the "-" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|-5     |
      
   @PositiveNegativeNumbersSubTest
  Scenario Outline: Test Subtraction of one Positive and one Negative Numbers
    Given I want to "subtract two positive numbers"
    When I enter the first number <number1>
    Then I click the "-" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 7     	|13     |
      
    @DecimalNumbersSubTest
  Scenario Outline: Test Subtraction of decimal Numbers
    Given I want to "Test Subtraction of decimal Numbers"
    When I enter the first number <number1>
    Then I click the "." button
     When I enter the first number <number1>
    Then I click the "-" button
     And I enter the second number <number2>
    Then I click the "." button
     And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|5.5      |