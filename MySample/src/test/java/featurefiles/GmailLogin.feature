Feature: Mail Box login

Scenario: Verification of login page
  Given I want to open gmail page "chrome" browser
  And  I want launch the gmail application 
 #And I click on button "Signin" 
  And I want enter gmail "Text" as "test.test@gmail.com"
  And I click on gmail button "Next"
  And I want enter gmail "Password" as "********"
  And I click on gmail button "Nextpage"   
  

