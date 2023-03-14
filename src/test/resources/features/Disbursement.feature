
@tag
Feature: Disbursement

  @tag1
  Scenario Outline: user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on disbursement dashboard
    Then user tap on CTA in UW  dashboard
    Then user enter <loanAmount> in the text field
    Then user tap on CTA after entering loan amount
    Then chooses tenure
    Then user tap on the promo code hyperlink
    Then user select one promo code
    Then user taps on apply button
    Then user removes promo code
    Then user continues to loan information
    #Then user taps on view details
    Then user taps on disbursement amount info
     #Then user tap on know more text
     Then user tap on checkbox
     Then user tap on confirms button and enter OTP
    #Then user  taps on okaygotitCTA
    #Then user tap on know more text
    #Then tap on fibeEnsure hyperlink
    #Then user tap on policy T&C hyperlink
    #Then user tap on assignemnt declaration
    #Then user tap on loan agreement hyperlink
    #Then user tap on another T&C hyperlink
    #Then user tap on KFS hyperlink
    #
    #
    #
        #
    

  

    Examples: 
      | mobileNumber  |loanAmount|
      |8858174430| 20000|
    
