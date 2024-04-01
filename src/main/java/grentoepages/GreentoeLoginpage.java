package grentoepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import greentoeUtilities.GreentoeBasclass;

public class GreentoeLoginpage extends GreentoeBasclass 
{
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[3]/div[3]/div/a[1]")
	public static WebElement login_link;
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
	public static WebElement login_username;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	public static WebElement login_password;
	
	@FindBy(xpath="//*[@id=\"rc-anchor-container\"]/div[3]/div[1]")
	public static WebElement login_captcha;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/input[3]")
	public static WebElement login_btn;
	
	public static void greentoeLogin()
	{
		
		click(GreentoeLoginpageObject.login_link);
		sendkey(GreentoeLoginpageObject.login_username, "anveshsamala5949@gmail.com");
		sendkey(GreentoeLoginpageObject.login_password, "Rahul123@");
		click(GreentoeLoginpageObject.login_captcha);
		click(GreentoeLoginpageObject.login_btn);
		
	}
}
