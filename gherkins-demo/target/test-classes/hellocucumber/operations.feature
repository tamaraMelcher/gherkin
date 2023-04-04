Feature: Standard arithmetic operations
    As a user I would like to be able to use the standard arithmetic operations: addition, subtraction, multiplication and division

  Background:
    Given I initialise a calculator

  # Each scenario can be seen as a test that can be executed with JUnit,
  # provided that each of the steps (Given, When, And and Then) are
  # implemented in a Java mapping file (CalculatorSteps.Java)

  Scenario: Adding two integer numbers
    Given an integer operation '+'
    When I enter the first number 4
    And I enter the second number 5
    Then the operation results 9

  Scenario: Subtracting two integer numbers
      Given an integer operation '-'
      When I enter the first number 7
      And I enter the second number 5
      Then the operation results 2

  Scenario: Multiplying two integer numbers
    Given an integer operation '*'
    When I enter the first number 7
    And I enter the second number 5
    Then the operation results 35

  Scenario: Dividing two integer numbers
    Given an integer operation '/'
    When I enter the first number 7
    And I enter the second number 5
    But the second number cannot be 0
    Then the operation results 1

    Scenario: Dividing two integer numbers with zero
        Given an integer operation '/'
        When I enter the first number 7
        And I enter the second number 0
        But the second number cannot be 0
        Then the operation results 1

      #🥒: Subtracting two integer numbers
        #😐 an integer operation '-'
        #🎬 I enter the first number 7
        #😂 I enter the second number 5
        #🙏 the operation results 2