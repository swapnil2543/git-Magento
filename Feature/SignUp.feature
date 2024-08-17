Feature: Sign Up Functionality

Scenario Outline: User Create Login with valid creadentials
Given User launch browser
And User opens portal "https://magento.softwaretestingboard.com"
When User click on create an Account link
And User add firstname as "<FirstName>", lastname as "<LastName>", email as "<Email>", password as "<Pass>" & confirm password as "<ConfirmPass>" 
And User click on Create an Account button
Then User should see My Account Page
And User close the browser

Examples:
|FirstName|LastName|Email|Pass|ConfirmPass|
|Swapnil|Gaikhe|swapnil009@gmail.com|$wap@#$123|$wap@#$123|


Scenario: User should successfull login with valid credentials
Given User launch browser
And User opens portal "https://magento.softwaretestingboard.com"
When User click on Sign In link
And User add email as "swapnil009@gmail.com" & password as "$wap@#$123"
And User hit on sign In button
Then Dashboard page title capture by user
And User click on Signout option from dropdown
And User close the browser
