Feature: Etsy title verification
  User story: As a user when I am on the etsy home page
  I should be able to see title as expected


  Scenario: home page title verification
    When user on Etsy page
    Then user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone title


    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      Given user on a home page
      When user types Wooden Spoon in the search box and clicks search button
      Then user sees Wooden Spoon is in the Title


  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user on a home page
    When user types "Wooden Spoon" in the search box and clicks search button
    Then user sees "Wooden spoon - Etsy" is in the Title