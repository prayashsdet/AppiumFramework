Feature: First Milestone

  @firstMilestone
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
    And user logs out of the application successfully

    Examples: 
      | firstName | lastName | employmentType | DOB        | PAN        | mobileNumber |
      | Raj       | Ranjan   | salaried       | 09/09/1996 | HSSPS9761P |   7555475178 |
