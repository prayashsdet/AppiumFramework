Feature: Auto Debit

  @tag1
  Scenario Outline: Auto Debit
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on auto-debit dashboard
    And user tap on CTA on fibe card
    Then user is shown welcome screen
    Then he tap on CTA again
    Then user select online/offline option
    Then user tap on print and upload NACH  form
    Then user click NACH form photo
    Then user upload NACH form
    Then user should be landed on acknowledgement screen
    
    Examples:
    
   | mobileNumber|
   |7008405914|
     
