Feature: Create Lead in the leaftaps application

Scenario: Login with positive value
Given Launch the Browser and Load the Url
When Enter the username as 'demoSalesManager'
And Enter the passWord as 'crmsfa'
And Click on Login Button
Then Verify the login is successful
When Click on the crmsfa button
And Click on create lead button
And Enter the Company name as Qeagle
And Enter the First name as Harrish
And Enter the Last name as A
And Click create lead button
Then Verify the lead is created

