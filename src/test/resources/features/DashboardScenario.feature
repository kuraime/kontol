Feature: View Dashboard Account Summary

@AccountSummary
Scenario Outline: Copy Account Number on Account Summary Card Dashboard
  Given the user already logged in with valid "<password>" on dbank pro
  When the user tap copy account number
  Then the user should be successfully copy account card number & verify the toast message
  And User Verify Content on Account Summary Card Dashboard
  Examples:
    | username | password |
    |          | Reskin01 |

@AccountSummary
Scenario: User view Unmask Amount
  When I tap the icon eye for see the amount value on Account Summary Dashboard
  Then I should see the amount value on Account Summary Dashboard

@AccountSummary
Scenario: View Account Summary Detail
    When the user tap button view detail
    Then the user should be directed to account summary card detail
    And I tap back from screen account summary card detail
    Then I should be back to screen account summary dashboard

@AccountSummary
Scenario: User tap the button Transfer
  When I tap the icon transfer rupiah
  Then I should be direct to screen transfer
  And I tap back from screen transfer
  Then I should be back to screen account summary dashboard

@AccountSummary
Scenario: User See the MCA Account and Switch to MCA Currency
  When I swipe to right for choose the card multiple currency account
  And I tap the dropdown list multiple currency account
  Then I should see the list of currency
  And I choose the one of above currency
  Then I should see the card with multiple currency account