Feature: HiOscar app title verification feature
  User Story:
  As a user, I should be able search network with given credentials and should be able to see Oscar title


  Scenario: HiOscar Search Functionality Title Verification
    Given User on HiOscar home page
    When user clicks on search button
    And user selects Select "2023" option from Coverage year dropdown
    And user selects Select "Employer-provided" option from Coverage access dropdown
    And user selects Select "Oscar" option from Network partner dropdown
    And user selects Select "New Jersey" option from Coverage area dropdown
    And user clicks Continue button
    Then user should see that title contains Oscar