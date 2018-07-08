package stepdefenition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import amazonpages.GmailPage;

public class GmailLoginSteps extends GmailPage {
	
	public GmailLoginSteps() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^I want to open gmail page \"(.*)\" browser$")
	public void  want_open_browser (String browser){
		openBrowser(browser);
	}

	@And ("^I want launch the gmail application$")
	public void launch_application (){
		navigateURL();
	}
	
	@And ("^I want enter gmail \"(.*)\" as \"(.*)\"$")
	public void want_enter_value (String xpath, String textValue){
		
		enterText(xpath, textValue);
	}
	
	@And ("^I click on gmail button \"(.*)\"$")
	public void click_button (String xpath){
		clickButton(xpath);
	}

}
