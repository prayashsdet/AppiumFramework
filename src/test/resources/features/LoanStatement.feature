
@tag
Feature: Loan Statement
  

  @tag1
  Scenario Outline: Happy Flow for a loan statement
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user click on loan statement icon
    Then loan details are displayed
    Then user tap on download and send email
    Then user checks if filter is working properly for active,closed and pending loans
    Then user open the loan card and particular loan details are diplayed to customer
    Then user taps on more details and user tap on back button
    Then ueser taps on request for cancellation for loan 
    

 

    Examples: 
      | mobileNumber  | 
      | 9503043368 |