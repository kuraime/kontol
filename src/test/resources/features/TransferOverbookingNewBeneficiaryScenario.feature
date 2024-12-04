Feature: Transfer Overbooking New Beneficiary

@TransferOverbooking
Scenario Outline: Trying to Login on binded device
  Given the user is on the Login page
  When the user enters the "<password>" and tap login button
  Then the user should see the dashboard or home page

  Examples:
    | username | password |
    |          | Reskin01 |

@TransferOverbooking
Scenario: Tap Transfer Rupiah on Dashboard Card
  Given the user is on the Dashboard page
  When the users tap on Transfer Rupiah
  Then the user should see the choose Transfer Rupiah page

@TransferOverbooking
Scenario: Tap Other Account in IDR Transfer Page
  Given the user is on the IDR Transfer page
  When the users tap on Other Account
  Then the user should see Select Destination Account Bottomsheet

@TransferOverbooking
Scenario: Tap Add New Recipient in the Bottomsheet
  Given the user is on the Select Destination Account Bottomsheet
  When the users tap Add New Recipient
  Then the user should see list of available Bank

@TransferOverbooking
Scenario: Tap Bank Danamon in List of Available Bank
  Given the user is on the Add New Recipient Bottomsheet
  When the users tap Bank DANAMON
  Then the user should move to next page to input account number

@TransferOverbooking
Scenario Outline: Input correct Danamon account number
  Given the user is on Add New Danamon Recipient Bottomsheet
  When the user input correct account number "<acctNo>" and tap next
  Then the user should move to next page to input amount

Examples:
  | acctNo       |  |
  | 003600504116 |  |

@TransferOverbooking
Scenario Outline: Input amount in Transfer Amount Bottomsheet
  Given the user is on Transfer Amount Bottomsheet
  When the user input amount "<amount>", input notes "<notes>" and tap Next
  Then the user should move to source of fund page

Examples:
  | amount | notes                                         |
  | 1000   | Transfer Overbooking New Beneficiary Scenario |

@TransferOverbooking
Scenario: Choose active source of fund in Source of fund Bottomsheet
  Given the user is on Source of fund Bottomsheet
  When the user choose the product and tap next
  Then the user should move to Confirmation Page

@TransferOverbooking
Scenario: User review in the confirmation page
  Given the user is on the Confirmation Page
  When the user tap Confirm
  Then the user should move to MPIN Page

@TransferOverbooking
Scenario Outline: User input correct MPIN
  Given the user is on the MPIN Page
  When the user input pin "<pin>"
  Then the user should move to ACK Page

  Examples:
    | pin         |  |
    | 1,1,1,1,1,1 |  |

@TransferOverbooking
Scenario: User back to Homepage in ACK Page
  Given the user is on the ACK Page
  When the user tap Back to Homepage
  Then the user should move to Dashboard Page


