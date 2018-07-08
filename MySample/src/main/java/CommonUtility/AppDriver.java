package CommonUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppDriver {
	
	public static WebDriver driver;
	public static Properties ObjectFile;
	
	public AppDriver() throws Throwable{
		ObjectFile = new Properties();
	    FileInputStream fis= new FileInputStream(new File("E:\\SOWMYA\\Selenium\\Framework_Design\\src\\Configdata\\Objects.Properties"));
	    ObjectFile.load(fis);
	}
	
	public static void openBrowser(String browser){
		 
		try{	 
		    if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\SOWMYA\\Selenium\\JavaPractise\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		    System.out.println("User is able to open a   browser");
		    }
		    
		    //else if
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.println("User is unable to open a  browser");
		}
	}
	
	public static void navigateURL (){
		try{
			//driver.get("https://www.amazon.com");
			driver.get("https://gmail.com");
			System.out.println("User is able to launch the application");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is unable to launch the application");
		}
	}
	
	public static void enterText(String objectXpath, String textValue){
		try{
			driver.findElement(By.xpath(ObjectFile.getProperty(objectXpath))).sendKeys(textValue);
			System.out.println("User is entered " + textValue + " to the text box");
		}catch (Exception e){ 
			e.printStackTrace();
			System.out.println("User is not able to enter " + textValue + " to the text box");
		}
	}
	
	public static void clickButton(String objectXpath){
		try{
			driver.findElement(By.xpath(ObjectFile.getProperty(objectXpath))).click();
			System.out.println("User is able to click the button");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is unable to click the button");
		} 
	}

	public static void getTextValue(String objectXpath){
		try{			
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			/*waiting for the element
			WebDriverWait wait = new WebDriverWait(driver, 80);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ObjectFile.getProperty(objectXpath))));*/
			
			//after element found, do the necessary action
			WebElement element = driver.findElement(By.xpath(ObjectFile.getProperty(objectXpath)));
			String textValue = element.getText();
			
			
			//String a = driver.findElement(By.xpath(ObjectXpaths.getProperty(objectXpath))).getText();
			
			System.out.println(textValue);
		}catch (Exception e){
			e.printStackTrace();
		} 
	}
	public static void getAttributeValue(String objectXpath){
		
		WebElement element = driver.findElement(By.xpath(ObjectFile.getProperty(objectXpath)));
		String value=element.getAttribute("value");
		System.out.println(value); 
	    
		}

	public static void getClassValue(String objectXpath){
		WebElement element = driver.findElement(By.xpath(ObjectFile.getProperty(objectXpath)));
		System.out.println(element.getClass()); 
		
	}

}
