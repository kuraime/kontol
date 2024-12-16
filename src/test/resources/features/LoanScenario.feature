Feature: Account Summary Refinement Financial
  Background: As a user, i want to view Financial Loan List & Detail via Account Summary Financial Loan List

@AccountSummaryLoan
Scenario Outline: I am view Account Summary Loan
  Given the user is on the Login page "<binding>"
  When the user enters "<username>" and "<password>"
  Then clicks the login button
  And i tap the navigation financial
  And i tap the menu loan
  Then i should be directed to loan list

  Examples:
    | username | password | binding  |
    |          | Reskin01 |  true    |

@AccountSummaryLoan
Scenario Outline: I am view Loan Detail
  When i tap one of above the loan account "<account_number>"
  Then i should see the loan account detail
  And i tap back from account summary loan detail
  Then i should be directed to loan list
  Examples:
    | account_number |
    | 003600254423   |