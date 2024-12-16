Feature: Reactivation

@SplashPage
Scenario: User navigates from the splash page to the next page by clicking a button
  When the splash page is displayed
  Then there should be two buttons on the splash page
  Then the user clicks on the registered user button and navigate to login page

@Login
Scenario Outline: Successful Login Not Binding
  Given the user is on the Login page "<binding>"
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  Then the user should see information verification page
  Then the user click next button
  Then the user should see verification mobile phone page
  When the user input otp activation
  Then the user click next button
  When the user input pin "<pin>"
  Then the user should see success activation account

  Examples:
    | username       | password | pin         | binding |
    | cheese123      | Reskin01 | 1,4,7,2,5,8 | false   |

@Login
Scenario Outline: Successful Login Binding
  Given the user is on the Login page "<binding>"
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  Then the user should see the dashboard or home page

  Examples:
    | username       | password | binding |
    |                | Reskin01 | true    |