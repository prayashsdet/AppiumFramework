@tag
Feature: Bank statement

  @tag2
  Scenario Outline: Happy flow for bank statement
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    And User is on Dashboard
    Then user pick one <bankName>
    Then user will choose offline/online option to upload bank statement
    Then user will select the option to upload 3 month bank statement in one file
    Then user will upload <bankStatementPdf> and click on submit button
     And user logs out of the application successfully

    Examples: 
      | bankName | bankStatementPdf       | mobileNumber |
      | Axis     | DecJanFeb.pdf |   7008405914 |
