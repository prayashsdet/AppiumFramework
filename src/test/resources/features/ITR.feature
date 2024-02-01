Feature: ITR

  Scenario Outline: Happy flow of ITR
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
      When user is in  ITR journey dashboard
    Then user will be  redirected to ITR journey upload screen
    Then user has to then  upload <ITR>

    Examples: 
      | mobileNumber | ITR      |
      |   9655586012 | ITRV.pdf |
