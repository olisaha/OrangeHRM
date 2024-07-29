Feature: Validating Admin page elements

Scenario: Validating the edits  of an admin user in Admin page
 Given the user logs in using valid credentials
 When user clicks "Admin" button from the side panel
 When the user deletes "Admin" user from Records tab
 Then user should receive message
 
 
 Scenario: Validating the edits of an ESS user in Admin Page
 Given the user logs in using valid credentials
 When user clicks "Admin" button from the side panel
 When the user deletes "ESS" user from Records tab
 Then user should receive message
 