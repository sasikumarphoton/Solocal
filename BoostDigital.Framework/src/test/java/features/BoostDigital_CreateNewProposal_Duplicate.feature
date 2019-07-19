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
 And click on duplicate button
 And enter name of the proposal
 And click on Valider
 And verify the newly created proposal is listed
 And select the new proposal
 And click on delete button
 Then close the browser
 
 