package stepdefenition;

import amazonpages.GiftCardPages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Attribute;

public class GiftCardStep extends GiftCardPages{
	
	
	public GiftCardStep() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^I want to open \"(.*)\" browser$")
	public void  want_open_browser (String browser){
		//open browser
		openBrowser(browser);
		
	}

	@And ("^I want launch the application$")
	public void launch_application (){
		navigateURL();
	}
	
	@And ("^I want enter \"(.*)\" as \"(.*)\"$")
	public void want_enter_value (String xpath, String textValue){
		
		enterText(xpath, textValue);
	}
	
	@And ("^I click on button \"(.*)\"$")
	public void click_button (String xpath){
		clickButton(xpath); 
	}
	
	@And ("^I get the Value of Giftcard \"(.*)\"$")
	public void  giftvalue (String xpath){
		getAttributeValue(xpath);
		 
	}
	
	@And("^I get the class name \"(.*)\"$")
	public void getclassname(String xpath){
		getClassValue(xpath); 
	}
	
	
	
}
