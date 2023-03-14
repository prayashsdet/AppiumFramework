@tag
Feature: Happy Flow for underwriter suspend journey
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Happy flow for UW Suspend
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on UW suspend dashboard and user clicks on CTA
    Then user is redirected to reason list screen
    Then user will have to update <password>
    Then user has to provide <appointmentLetter>
    Then user will  provide his salary slips <salaryslip1>,<salaryslip2>,<salaryslip3>
    Then user will update "<PANnumber>"
    Then will provide salary missing reasons
    Then user or the customer  provide <ITR>
    Then user pick one <bankName>
    Then user will choose offline/online option to upload bank statement
    Then user will select the option to upload 3 month bank statement in one file
    Then user will upload <bankStatementPdf> and click on submit button
    Then after user  enter <Bank Name>
    And user then  enter "<account number>"
    And user will re-enter "<account number>"
    Then user will enter "<IFSC code>"
    Then user will tap on save bank details cta
    Then use has completed KYC

    Examples: 
      | appointmentLetter | salaryslip1   | salaryslip2   | salaryslip3   | PANnumber  | mobileNumber | password | ITR      | bankName | bankStatementPdf |
      | DecJanFeb.pdf     | DecJanFeb.pdf | DecJanFeb.pdf | DecJanFeb.pdf | HSSPS9761P |   7555475178 | affafsaf | ITRV.pdf | Axis    | OctNovDec.pdf    |
