@Login
Feature: Users can purchase, sell & return from the online Amazon website
Description: "User can search the iPhone, check the price, and purchase the"
 "iPhone with a valid credit card."
Scenario:
Login with valid authentication and can check the price of an iPhone also verify price
Given Customer can open any browser
And Navigate to "https://www.amazon.com/"
And Customer can enter "userName" and "Password"
And Click on Submit button
And Verify Home page title
When enter in search box product name as a iPhone
And Customer able to see list of the iPhone on screen
And Customer can print the entire price
And Customer can click on third number iPhone
Then Customer verify the price
