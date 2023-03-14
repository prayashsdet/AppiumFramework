
@tag
Feature: Title of your feature
  I want to use this template for my feature file

   @firstMilestone
  Scenario Outline: Complete first milestone/block (name,dob,employment)
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    Then user should be landed on social login screen
    When user taps on setup account and switches to toggle view 
    When user enter <firstName> and <lastName>
    And user selects <DOB>
    And select "<employmentType>"
    And tap on cta button
    And user should be asked to enter <PAN> or it should be fetched from nsdl
    Then user should land on complete profile page
    And user logs out of the application successfully

    Examples: 
      | firstName | lastName | employmentType | DOB        | PAN        | mobileNumber |
      | Raj       | Ranjan   | salaried       | 09/09/1996 | GPUPP7328P |   7008405914 |
