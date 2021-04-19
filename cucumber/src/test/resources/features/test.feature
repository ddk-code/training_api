Feature: testing cucumber
  Scenario: testing get
    When requests get to /users
    Then response