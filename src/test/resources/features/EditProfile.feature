Feature: EditProfile

  Scenario Outline: A Valid edit profile
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    Then user taps on hamberger menu
    Then user goes to edit profile
    Then user changes the <emaildAdress>
    Then enter <newEmailAdress>
    Then user tap on  edit home address
    Then user has to enter  <complete address>
    Then user  will enter <flat no>
    Then user enter the <locality> field
    Then after entering  "<pincode>"
    Then city is auto-populated
    And user taps on saveCTA

    Examples: 
      | mobileNumber | complete address | flat no | locality    | pincode |emaildAdress| newEmailAdress|
      |   7008405914 |hkjhjhk     |     102 | clover parkgkj |  411014 |ywwafgu@gmail.com|rahiioea@gmail.com|

  Scenario Outline: B days limit edit home address
    Then Again user  change home  details then user is not allowed
    Then user has to enter  <complete address>
    Then user  will enter <flat no>
    Then user enter the <locality> field
    Then after entering  "<pincode>"
    Then city is auto-populated
    And user taps on saveCTA

    Examples: 
      | complete address    | flat no | locality     | pincode |
      | rajaramgjk patil nagar |     103 | lane twgigigeleve |  411014 |

  Scenario Outline: C Valid work address
    Then user tap the editworkaddressbutton
    Then user  type the   <companyName>
    Then user   put the <completeOfficeAddress>
    Then user enter the <officeLocality> field
    Then after providing  "<officepincode>" and user taps on saveofficeaddressCTA

    Examples: 
      | companyName | completeOfficeAddress | officeLocality | officepincode |
      | earlysalnlnlary | panchsil towers       | vimannagar     |        411014 |

  Scenario Outline: D limit check for work address
    Then user if changes the office  details then user is not allowed
    Then user tap the editworkaddressbutton
    Then user  type the   <companyName>
    Then user   put the <completeOfficeAddress>
    Then user enter the <officeLocality> field
    Then after providing  "<officepincode>" and user taps on saveofficeaddressCTA

    Examples: 
      | completeOfficeAddress | officeLocality | officepincode |
      | banerghetta road      | BTM Layout     |        411014 |

  Scenario Outline: E valid bank details
  Then user has to then  change bank details 
    Then after user  enter <Bank Name>
    And user then  enter "<account number>"
    And user will re-enter "<account number>"
    Then user will enter "<IFSC code>"
    Then user will tap on save bank details cta
    #Then user if again try to change bank details again user should not be allowed

    Examples: 
      | Bank Name | account number | IFSC code |
      | State     |      577787587 | UTIB00027 |
