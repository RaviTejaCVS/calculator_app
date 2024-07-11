#Author: Ravi Teja
@MultiplicationTest
Feature: Verify Multiplication Functionality


Background: I landed in Calculator Web Application

	@PositiveNumbersMultiplyTest
  Scenario Outline: Test Multiplication of Positive Numbers
    Given I want to "Multiply two positive numbers"
    When I enter the first number <number1>
    Then I click the "×" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|6      |
      
   @NegativeNumbersMultiplyTest
  Scenario Outline: Test Multiplication of Positive Numbers
    Given I want to "Multiply two positive numbers"
    Then I click the "-" button
    When I enter the first number <number1>
    Then I click the "×" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|6      |
      
      
       @PositiveNegativeNumbersMultiplyTest
  Scenario Outline: Test Multiplication of  and Negative Positive Numbers
    Given I want to "Test Multiplication of  and Negative Positive Numbers"
    When I enter the first number <number1>
    Then I click the "×" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 7     	|-42     |
    
    @DecimalNumbersMultiplyTest
  Scenario Outline: Test Multiplication of Decimal Positive Numbers
    Given I want to "Multiply two Decimal positive numbers"
    When I enter the first number <number1>
    Then I click the "." button
     When I enter the first number <number1>
    Then I click the "×" button
     And I enter the second number <number2>
    Then I click the "." button
     And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|7.26      |