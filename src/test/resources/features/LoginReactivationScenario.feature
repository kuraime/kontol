Feature: Reactivation

@SplashPage
Scenario: User navigates from the splash page to the next page by clicking a button
  When the splash page is displayed
  Then there should be two buttons on the splash page
  Then the user clicks on the registered user button and navigate to login page

@LoginReactivation
Scenario Outline: Successful Login
  Given the user is on the Login page
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  Then the user should see the dashboard or home page

Examples:
  | username       | password |
  | 14454026rolita | Reskin01 |
