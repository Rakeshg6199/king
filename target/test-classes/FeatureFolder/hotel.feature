@search @smoke 
Feature: Verify the search page of ecommerce page

@argos
Scenario: Verify the search of argos application

Given User is on argos page

When User enters "sofa" in the argos search box

And User clicks the search button of argos

Then User see the logo of argos page

@tesco @sanity @ignore
Scenario: Verify the search of tesco application

Given User is on tesco page

When User enters "water bottle" in the tesco search box

And User clicks the search button of tesco

Then User see the logo of tesco page

@tesco
Scenario: Verify the search of Asos application

Given User is on Asos page

When User enters "mens fashion" in the Asos search box

And User clicks the search button of Asos


Then User see the logo of Asos page