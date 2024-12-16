@pinChange
Feature: Change Mpin

  @pinChange
  Scenario Outline: Login to dbankpro
    Given the user is on the Login page "<binding>"
    When the user enters "<username>" and "<password>"
    Then clicks the login button

    Examples:
      | binding | username | password |
      | true    |          | Reskin01 |

  @pinChange
  Scenario: User navigate to setting page
    Given the user should see the dashboard or home page
    When the user click the setting button on the navigation
    Then the user will redirected to the setting page


  @pinChange
  Scenario Outline: Change mPin from setting page
    When the user click ubah mpin on the setting menu
    Then the user input pin "<old mPin>"
    Then the user input pin "<new mPin>"
    Then the user input pin "<new mPin>"
    Then User will verify that their mPin has been changed

    Examples:
      | old mPin | new mPin |
      | 1,2,1,2  | 1,4,1,4  |