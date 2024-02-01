Feature: Refer and Earn

  @tag2
  Scenario Outline: Happy flow for refer and earn
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    Then apply for <referralCode> in social login screen
    Then user should be landed on social login screen
    Then user applies <referralCode> through welcme screen
    Then user goes to side menu
    And applies <referralCode> from the sideMenu
    Then if user is able to edit referral code
    And user referral code is displayed successfully 
    Then referral code module is working properly      
    
    

    Examples: 
      | mobileNumber | referralCode |
      |   7008405914 | sudhf892374  |
