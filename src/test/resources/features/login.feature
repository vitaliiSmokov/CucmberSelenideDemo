Feature: Login User

  Scenario: Login user
    When Click "Log In" button
    And Input login
    And Input password
    And Click "Log in" button span
    Then Notification with "Logged in." is visible