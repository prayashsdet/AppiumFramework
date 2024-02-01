Feature: First Jobber

  @tag1
  Scenario Outline: Happy flow for first jobber
    Given user launches the app
    And user is on login screen
    When users enters "<mobileNumber>"
    And taps on T&C checkbox
    And taps on getOtp button
    And taps on login button
    When user is on firstjobber journey dashboard
    Then user redirected to offer letter upload screen
    Then user will upload <offerLetter>
    Then user will verify the <workEmailID>
    And user taps on CTA
    And after completing firstJobber journey and go to dashboard

    Examples: 
      | mobileNumber | workEmailID           | offerLetter   |
      |   7008405914 | rakes@earlysalary.com | DecJanFeb.pdf |
