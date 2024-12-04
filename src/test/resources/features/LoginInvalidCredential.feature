Feature: Login with invalid credential

  @LoginInvalidCredential
  Scenario: Open Dbankpro app to splash screen
    When user open dbankpro app
    Then User will go to the splash screen
    Then User will go to the login page

  @LoginInvalidCredential
    Scenario Outline: User try to login with invalid credential
      Given user is in login page
      When User input "<username>" and "<password>"
      Then User click login button
      Then User will see popup for invalide credential

      Examples:
        | username    | password |
        | perkontolan | abadi    |