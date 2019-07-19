@BoostDigital_CreateNewProposal_Duplicate
 Feature: Boost Digital Create New Proposal through duplicate option
  
 Scenario: Boost Digital Create New Proposal through duplicate option
 
 Given user launches the Boost Digital application
 When user enters username and password
 And click on connect
 And EPJ entry screen is displayed
 And user enters the EPJ number
 And click on continue
 And user click on voir les propostions button in the dashboard screen
 And click on a proposal from the list
 Then click on duplicate button
 Then enter name of the proposal
 Then click on Valider
 Then verify the newly created proposal is listed
 Then select the new proposal
 And click on delete button
 Then close the browser
 
 