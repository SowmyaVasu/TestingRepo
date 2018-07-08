
package amazonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtility.AppDriver;


public class GiftCardPages extends AppDriver{
	
	public GiftCardPages() throws Throwable{
		
	}

	@FindBy(xpath = "//*[@tabindex='50']") public WebElement GiftCard_Link;
	@FindBy(xpath = "//img[@alt='eGift']")public WebElement image;
	//@FindBy(xpath = "//*[text()='$25']") public WebElement GiftCard_Value;
	@FindBy(xpath="//span[@id='a-autoid-21']/span/button") public WebElement GiftCard_Value;
	@FindBy(xpath = "//*[text()='$25']") public WebElement myclass;
	//@FindBy(xpath = "//*[@id='twotabsearchtextbox']") public WebElement Search_Text;
	//@FindBy(xpath = "//*[text()='Registry']") public WebElement Registry;
	
	
	
	
	



}
