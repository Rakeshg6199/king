
Feature: Verify the search page

#Background: browserLaunch
#Given User is on chrome browser
 

Scenario: Verify search page of amazon

Given User is on amazon search page

When User enter "iphone 14" in amazon search page

And User click the search button in amazon

Then Verify the logo is displayed in amazon

Scenario: Verify search page of flipkart

Given User is on flipkart search page

When User enter "iphone 14" in flipkart search page

And User click the flipkart search button

Then Verify the logo is displayed in flipkart

Scenario: Verify search page of Myntra

Given User is on myntra search page

When User enter "iphone 14" in Myntra search page

And User click the search button of Myntra

Then Verify the logo is displayed in myntra
