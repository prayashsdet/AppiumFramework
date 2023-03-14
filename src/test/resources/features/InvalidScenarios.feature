@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @firstMilestone
  Scenario Outline: Complete first milestone/block (name,dob,employment)
    Given user launches the app
    And user is on login screen
    When user directly taps on getOTP button without entering mobilenumber
    Then the blank mobile number error message should be displayed
    When users enters "<mobileNumber>"
    When user does not tick on checkbox and taps on save CTA
    Then the missing checkbox error message should be displayed
    And taps on T&C checkbox
    And if user taps on getOtp button without entering OTP
    And taps on login button
    Then the missing OTP error message should be displayed
    Then user enter valid OTP  and tap on login button
    Then user should be landed on social login screen
    When user taps on setup account and switches to toggle view
    When In form view firstname text field user enter invalid  <firstName>  and tap on CTA button
    Then the invalid first name  error message should be displayed
    Then user enter valid <validFirstName>  and it should be accepted
    When In form view lastname text field user enter invalid  <lastName>  and tap on CTA button
    Then invalid last name  error message should be displayed
    Then user enter valid <validLastName> and it should be accepted
    And If user has not selected DOB and taps on CTA
    Then the missing date of birth error message should be displayed
    Then user enters valid <DOB> and it should be accepted
    Then If user has not selected employment type and taps on CTA
    Then employment type should turn red
    And select "<employmentType>"
    And if user enters <invalidPAN>
    Then button should be disabled
    And user should be asked to enter <PAN> or it should be fetched from nsdl
    Then user should land on complete profile page
    And user logs out of the application successfully

    Examples: 
      | firstName | lastName | employmentType | DOB        | PAN        | mobileNumber | validFirstName | validLastName | invalidPAN |
      | R         | R        | salaried       | 09/09/1996 | GPUBP7328P |    700840591 | Prayash        | Pati          | GPUBB7328B |
