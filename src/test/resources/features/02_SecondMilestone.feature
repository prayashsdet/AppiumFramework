@smoke
Feature: PostPAN

  Scenario Outline: Happy flow for Post-PAN
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    Given User is on Post-PAN screen
    When user has selected  relationship status
    Then user has entered "<monthlysalary>"
    And user select <workaddress> from google search
    Then user  type the   <companyName>
    Then user   put the <completeOfficeAddress>
    Then user enter the <officeLocality> field
    Then after providing  "<officepincode>" and user taps on saveofficeaddressCTA
    And user picks the  <homeAddress> from google search bar
    Then user has to enter  <completeHomeAaddress>
    Then user  will enter <flatNo>
    Then user will provide   <homeLocality> field
    Then after user provides  "<homePincode>" and taps on saveCTA
    Then user should land on Upload bank statement/Complete KYC  acknowledgement screen
    And user logs out of the application successfully

    Examples: 
      | monthlysalary | workaddress | homeAddress | mobileNumber | companyName | completeOfficeAddress | officeLocality | homeLocality | officepincode | completeHomeAaddress | flatNo | homeLocality | homePincode |
      |         36000 | earlysalary | annastays   |   7008405914 | earlysalary | panchsil towers       | vimannagar     | cloverpark   |        411014 | Anna stays           |    101 | kharadi      |      411014 |
