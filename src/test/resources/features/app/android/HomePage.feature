Feature: Home Page Testing App

 @android @final

    Scenario: Verify the version code and version name display on home page
    Given User is on home screen
    When User taps on Email field
    And User enters "0000" in email field
    And User taps on Password field
    And User enters "Cl3@rC@pt10ns!" in password field
    And User taps on Signin button
    Then User should see Select Environment screen
    When User taps on Production
    And User taps on Save button
    Then User should see home screen
    When User taps on Email field
    And User enters "ahsan.kahn+996@vimient.com" in email field
    And User taps on Password field
    And User enters "Vista!@#135!@#" in password field
    And User taps on Signin button
    Then User should see welcome screen
    When User taps on continue button
    And User taps on next button
    Then User should see Wellness Dashboard
    When User taps on menu button
    And User taps on Signout button
    Then User should see home screen