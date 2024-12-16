Feature: Account Summary Refinement Financial
  Background: As a user, i want to view Financial List & Detail via Account Summary Financial Screen

@AccountSummaryFinancial
Scenario Outline: I am view Account Summary List - CASA
  Given the user already logged in with valid "<password>" on dbank pro
   When i tap the navigation financial
   Then i should see the financial account summary
   And i scroll to bottom for view all account
   And i scroll to top for back to top
   Examples:
     | username | password |
     |          | Reskin01 |

Scenario Outline: I am view Account Summary Detail - CASA Account IDR
  When i tap one of above the casa account "<account_number>"
  Then i should see the account summary casa detail
  And i am verify the section casa detail
  And i am verify the section casa detail transaction history in five data sort as descending
  And i tap view all
  Then i should see the all transaction history
  And i tap back from transaction history
  Then i should be back to account summary detail
  Examples:
    | account_number |
    | 003601036936   |

Scenario: I am view Account Summary List - Goal Savings
  When i tap the toggle choose account or rekening
  Then i should see the account summary goal savings
  And i choose the goal savings options
  Then i should be switch to goal savings section
  And i scroll to bottom for view all account
  And i scroll to top for back to top

Scenario Outline: I am view Account Summary Detail - Goal Savings
  When i tap one of above the goal savings account "<account_number>"
  Then i should see the account summary goal savings detail
  And i am verify the section goal savings detail
  And i am verify the section goal savings transaction history in five data sort as descending
  And i tap view all
  Then i should see the all transaction history
  And i tap back from transaction history
  Then i should be back to account summary detail
  And i tap back from account summary detail
  Then i should be back to account summary financial list

  Examples:
    | account_number |
    | 003601080892   |

Scenario: I am view Account Summary List - Time Deposit
  When i tap the toggle choose account or rekening
  Then i should see the account summary time deposit
  And i choose the time deposit options
  Then i should be switch to time deposit section

Scenario Outline: I am view Account Summary Detail - Time Deposit
  When i tap one of above the time deposit account "<account_number>"
  Then i should see the time deposit detail
  And i am verify the section time deposit detail
  And i tap back from account summary detail
  Then i should be back to account summary financial list
  Examples:
    | account_number |
    | 003601060589   |