Feature: Verify Web Journey

  Scenario Outline: Login with valid credentials
    Given user launch application with url as "<URL>"
    When user enters mobile no "<Mobile>"
    And user click on GetOTP button
    And Executes "<OTPQuery>" and user enters OTP
    Then user login successfully

    Examples: 
      | URL                                             | Mobile     | OTPQuery                                                                                                                  |
      | https://eswebportalqanew.earlysalary.com/SignUp | 6888801505 | select otp_code from earlysalary.otp_log_detail where mdn = 6888801505 and status = 'DELIVERED' order by id desc limit 1; |

  Scenario Outline: User enter the basic details in form
    Given user enter first name <firstName>
    Then user enter last name <lastName>
    Then user select gender <gender>
    Then user enter Date of birth <DOB>
    Then user enter email address <email>
    Then user select employment type <employmentType>
    Then user monthly salary <salary>
    Then user enter office pincode <officePincode>
    Then user enter current residential pincode <pincode>
    Then user enter	Pancard number <panNumber>
    Then user click on I agree to  EarlySalary Terms & Conditions
    Then user click on submit button

    Examples: 
      | firstName | lastName | gender | DOB        | email                       | employmentType | salary | officePincode | pincode | panNumber  |
      | Nikhil    | Gayki    | Male   | 18/11/1994 | nikhil.gayki@earlyslary.com | Self-Employed  |  98000 |        411045 |  411014 | CPXPK2651Q |

   Scenario Outline: Close the application
     Given user should close browser