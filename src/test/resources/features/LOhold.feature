Feature: LoHold

  @tag1
  Scenario Outline: Happy flow for LoHold
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on lohold dashboard and user tap on cta
    Then user provide proper and valid  current address again
    Then user has to enter  <complete address>
    Then user  will enter <flat no>
    Then user enter the <locality> field
    Then after entering  "<pincode>"
    Then city is auto-populated
    And user taps on saveCTA
    Then user will have to submit proper and valid  kyc document again
    Then user clicks on  manual KYC  option
    Then user tap on aadhar chip
    Then user uploads front of aadhar
    Then user uploads back of aadhar
    Then user enters "<aadhar number>"
    Then user will submit aadhar
    Then user will have to submit proper and valid  selfie again
    Then user uploads selfie
    Then user provides the current address proof
    Then user will upload passbook again
    Then user will provide bank details again
    Then after user  enter <Bank Name>
    And user then  enter "<account number>"
    And user will re-enter "<account number>"
    Then user will enter "<IFSC code>"
    Then user will tap on save bank details cta
    Then user will have to provide or upload PAN card again
    Then will upload PAN

    Examples: 
      | aadhar number | complete address | flat no | locality    | pincode | Bank Name | account number | IFSC code  | mobileNumber |
      |          5775 | viman nagar      |     102 | clover park |  411014 | axis      |       6687687 | UTIB000007 |  9255557032 |
