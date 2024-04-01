package greentoeUtilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import grentoepages.GreeentoeSignUppage;
import grentoepages.GreentoeLoginpage;
import grentoepages.GreentoeWatchespage;

public class GreentoeBasclass 
{
	public static GreeentoeSignUppage GreeentoeSignUppageObject;
	public static GreentoeLoginpage GreentoeLoginpageObject;
	public static GreentoeWatchespage GreentoeWatchespageObject;
	public static WebDriver driver;
	
	public static File f;
	public static Properties pro;
	public static FileInputStream fis;
	public static Actions action;
	
	public static void intialization() throws IOException
	{
		
		pro=new Properties();
		f=new File("C:\\Users\\Anvesh\\eclipse-workspace\\greentoe\\src\\main\\java\\configuration.properties");
		fis=new FileInputStream(f);
		pro.load(fis);
	}
	public static void browserintialization()
	{
		if(pro.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Anvesh\\eclipse-workspace\\greentoe\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anvesh\\eclipse-workspace\\greentoe\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		action=new Actions(driver);
		
	}
	
	public static void launchUrl()
	{
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
	}
	public static void dropdown(WebElement element,String text)
	{
		Select abc=new Select(element);
		
		abc.selectByVisibleText(text);
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void clear(WebElement element)
	{
		element.clear();
	}
	public static void sendkey(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static void moveToElement(WebElement element)
	{
		
		action.moveToElement(element).build().perform();
	}
	public static void pageintialisation()
	{
		GreeentoeSignUppageObject=PageFactory.initElements(driver, GreeentoeSignUppage.class);
		GreentoeLoginpageObject=PageFactory.initElements(driver, GreentoeLoginpage.class);
		GreentoeWatchespageObject=PageFactory.initElements(driver, GreentoeWatchespage.class);
	}
	
	
	
//	public static void signupfunction()
//	{
//		click(GreeentoeSignUppageObject.signup_link);
//		sendkey(GreeentoeSignUppageObject.signup_email, pro.getProperty("username"));
//		sendkey(GreeentoeSignUppageObject.signup_password, pro.getProperty("password"));
//		sendkey(GreeentoeSignUppageObject.signup_confirm_password, pro.getProperty("confirmpassword"));
//		click(GreeentoeSignUppageObject.signup_capcha_checkbox);
//		click(GreeentoeSignUppageObject.signup_btn);
//	}
}
