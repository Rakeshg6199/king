
Feature: Verify the search page

#Background: browserLaunch
#Given User is on chrome browser
 

Scenario: Verify search page of next

Given User is on next search page

When User enter "fashion" in next search page

And User click the search button in next

Then Verify the logo is displayed in next

Scenario: Verify search page of puma

Given User is on puma search page

When User enter "shoes" in puma search page

And User click the puma search button

Then Verify the logo is displayed in puma

Scenario: Verify search page of matalan

Given User is on matalan search page

When User enter "fashion" in matalan search page

And User click the search button of matalan

Then Verify the logo is displayed in matalan
