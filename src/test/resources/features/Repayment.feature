
Feature: Repayment feature

  
  Scenario Outline: Happy flow for repayment
      Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on Repayment Dashboard
    Then user will tap on CTA in the repayment dashboard
    Then number of active loan and active loans are displayed
    Then user tap on view auto debit details 
    Then user tap on okaygotit CTA to close the drawer
    Then user tap on pay now
    Then user select pay EMI due option and tap on	pay now 
    Then user comes back again and select close loan option
    Then user select pay another amount option 
    Then user enter a "<amount>"
    Then user will pay through saved UPI ID
    Then user will pay through UPI apps
    Then user will pay through internet banking
    Then user will tap on success option 
    Then user will pay by entering UPI ID
    Then user has completed repayment journey successfully
    
    
    Examples: 
      |mobileNumber | amount|
     |     8858174430   |     20000|