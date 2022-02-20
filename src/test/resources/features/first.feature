Feature: Calculator

  Background: I have a calculator
  Scenario: Adding two numbers
    When I add 1 and 2
    Then I should get 3

  Scenario: Adding two numbers 44 and 55
    When I add 44 and 55
    Then I should get 99

  Scenario: Adding two numbers 111 and 222
    When I add 111 and 222
    Then I should get 333
