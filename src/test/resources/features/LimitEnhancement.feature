Feature: LimitEnhancement
@tag
 Scenario Outline: Complete first milestone/block (name,dob,employment)
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    Then user should be landed on social login screen
    When user enter <firstName> and <lastName>
    And tap on cta button
    And user selects <DOB>
    And again taps on cta button
    And select "<employmentType>"
    And user should be asked to enter <PAN> or it should be fetched from nsdl
    Then user should land on complete profile page
   
    

    Examples: 
      | firstName | lastName | employmentType | DOB        | PAN        | mobileNumber |
      | Raj       | Ranjan   | salaried       | 09/09/1996 | APUPP7328P |   7008405914 |

      Scenario Outline: Happy flow for Post-PAN
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
    
   

    Examples: 
      | monthlysalary | workaddress | homeAddress | mobileNumber | companyName | completeOfficeAddress | officeLocality | homeLocality | officepincode | completeHomeAaddress | flatNo | homeLocality | homePincode |
      |         36000 | earlysalary | annastays   |   7008405914 | earlysalary | panchsil towers       | vimannagar     | cloverpark   |        411014 | Anna stays           |    101 | kharadi      |      411014 |
      
      
      Scenario Outline: Happy flow for limit enhancement
    And User is on limit enhancement Dashboard
    Then user pick one <bankName>
    Then user will choose offline/online option to upload bank statement
    Then user will select the option to upload 3 month bank statement in one file
    Then user has to then upload the  <bankStatementPdf> and click on submit button

    Examples: 
      | bankName | bankStatementPdf |
      | Axis     | DecJanFeb.pdf    |