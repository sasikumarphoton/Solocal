package step_definitions;

import constant.BoostDigital_CreateNewProposal_Duplicate_Constants;
import constant.BoostDigital_CreateNewProposal_SocialClic_Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CommonLibrary;

public class BoostDigital_CreateNewProposal_Duplicate_Step extends CommonLibrary {
	
	
	@And("^click on a proposal from the list$")
	public void click_on_a_proposal_from_the_list() throws Throwable {
		isElementPresentVerifyClick(BoostDigital_CreateNewProposal_Duplicate_Constants.SELECTPROPOSAL);
	}

	@And("^click on duplicate button$")
	public void click_on_duplicate_button() throws Throwable {
		isElementPresentVerifyClick(BoostDigital_CreateNewProposal_Duplicate_Constants.DUPLICATEBUTTON);
	}

	@And("^enter name of the proposal$")
	public void enter_name_of_the_proposal() throws Throwable {
		EnterText(BoostDigital_CreateNewProposal_Duplicate_Constants.DUPLICATEPROPOSALNAME,
				BoostDigital_CreateNewProposal_Duplicate_Constants.DUPLICATEPROPOSALNAMEVALUE);			
	}

	@And("^verify the newly created proposal is listed$")
	public void verify_the_newly_created_proposal_is_listed() throws Throwable {
		isElementPresentVerifyClick(BoostDigital_CreateNewProposal_Duplicate_Constants.NEWDUPLICATEPROPOSAL);
	}

	@And("^select the new proposal$")
	public void select_the_new_proposal() throws Throwable {
		isElementPresentVerifyClick(BoostDigital_CreateNewProposal_Duplicate_Constants.NEWDUPLICATEPROPOSAL);
	}

	@And("^click on delete button$")
	public void click_on_delete_button() throws Throwable {
		isElementPresentVerifyClick(BoostDigital_CreateNewProposal_Duplicate_Constants.DELETEBUTTON);
	}
	
	
}
