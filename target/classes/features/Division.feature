#Author: Ravi Teja
@DivisionTest
Feature: Verify Division Functionality


Background: I landed in Calculator Web Application

	@PositiveNumbersDivideTest
  Scenario Outline: Test Division of Positive Numbers
    Given I want to "Divide two positive numbers"
    When I enter the first number <number1>
    Then I click the "÷" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|6      |
      
   @NegativeNumbersDivideTest
  Scenario Outline: Test Division of Positive Numbers
    Given I want to "Divide two positive numbers"
    Then I click the "-" button
    When I enter the first number <number1>
    Then I click the "÷" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|6      |
      
      
       @PositiveNegativeNumbersDivideTest
  Scenario Outline: Test Division of Positive and Negative Numbers
    Given I want to "Test Division of Positive and Negative Numbers"
    When I enter the first number <number1>
    Then I click the "÷" button
    Then I click the "-" button
    And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|-6     |
    
    @DecimalNumbersDivideTest
  Scenario Outline: Test Division of Positive Decimal Numbers
    Given I want to "Divide two positive decimal numbers"
    When I enter the first number <number1>
    Then I click the "." button
     When I enter the first number <number1>
    Then I click the "÷" button
     And I enter the second number <number2>
    Then I click the "." button
     And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 1     	|5.54545455      |
      
      
      @DecimalNumbersByZero
  Scenario Outline: Test Division of Positive Decimal Numbers
    Given I want to "Divide two positive decimal numbers"
    When I enter the first number <number1>
    Then I click the "." button
     When I enter the first number <number1>
    Then I click the "÷" button
     And I enter the second number <number2>
    Then I click the "." button
     And I enter the second number <number2>
		 Then I click the "=" button
    And I see the displayed sum is <result>
    Examples:
      | number1 | number2 |result |
      | 6        | 0     	|Error      |