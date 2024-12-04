Feature: Login LeafTaps Application with valid data

Scenario: Login with positive value
Given Launch the Browser and Load the Url
When Enter the username as 'demoSalesManager'
And Enter the passWord as 'crmsfa'
And Click on Login Button
Then Verify the login is successful


#Scenario: Login with invalid value
#Given Launch the Browser and Load the Url
#When Enter the username as 'demoSalesManager'
#And Enter the passWord as 'crmsfa'
#And Click on Login Button
#But Verify the login is not successful