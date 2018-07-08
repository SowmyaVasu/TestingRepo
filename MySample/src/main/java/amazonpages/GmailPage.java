package amazonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtility.AppDriver;

public class GmailPage extends AppDriver {
	public GmailPage() throws Throwable{
		
	}
	
	
	@FindBy(xpath = "//*[@id='identifierId']")public  WebElement Text;
	@FindBy(xpath = "//*[text()='Next']") public WebElement Next;
	@FindBy(xpath = "//*[@type='password']")public  WebElement Password;
	@FindBy(xpath = "//*[text()='Next']") public WebElement Nextpage;
	
	

}
