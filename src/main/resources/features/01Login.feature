Feature: Login Page Test

  Scenario: User Input Valid Username And Password
    Given User Enter Valid Url DMS
    When User Input Valid Username
    And User Input Valid Password
    And User Click Button Login
    Then User Get Text Logo DMS In Home page









