Feature: Manual KYC
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Manual KYC
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user tap on complete KYC CTA
    Then welcome back screen is displayed
    Then user uploads selfie
    Then user clicks on  manual KYC  option
    Then user tap on aadhar chip
    Then user uploads front of aadhar
    Then user uploads back of aadhar
    Then user enters "<aadhar number>"
    Then user will submit aadhar
    Then user has to enter  <complete address>
    Then user  will enter <flat no>
    Then user enter the <locality> field
    Then after entering  "<pincode>"
    Then city is auto-populated
    And user taps on saveCTA
    Then will upload PAN
    Then after user  enter <Bank Name>
    And user then  enter "<account number>"
    And user will re-enter "<account number>"
    Then user will enter "<IFSC code>"
    Then user will tap on save bank details cta
    Then use has completed KYC

    Examples: 
      | aadhar number | complete address | flat no | locality    | pincode | Bank Name | account number | IFSC code   |mobileNumber |
      |          5775 | viman nagar      |     102 | clover park |  411014 | state     |       66898986 | UTIB0000027 |7008405914|
