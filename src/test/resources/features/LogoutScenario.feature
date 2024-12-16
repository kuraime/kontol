Feature: Logout

@LogoutFromHeaderDashboard
Scenario Outline: User want to logout from DBP 2.0 by click button at header dashboard
  Given the user is on the Login page "<binding>"
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  Then the user should see the dashboard or home page
  Then the user logout with "<flow>"

  Examples:
    | username       | password | binding | flow    |
    |                | Reskin01 | true    | header  |

@LogoutDashboardBackButton
Scenario Outline: User want to logout from DBP 2.0 by devices back button at dashboard
  Given the user is on the Login page "<binding>"
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  Then the user should see the dashboard or home page
  Then the user logout with "<flow>"

  Examples:
    | username       | password | binding | flow            |
    |                | Reskin01 | true    | back dashboard  |