Feature: TestCase002
  Scenario: Login to My Account
    Given Open shop website
    When Open the My Account tab
    And Enter a random email
    And Enter a random password
    And Click checkbox Remember me
    And Click button Log In
    Then Check the login status
