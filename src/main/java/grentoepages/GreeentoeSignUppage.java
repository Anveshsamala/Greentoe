package grentoepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import greentoeUtilities.GreentoeBasclass;



public class GreeentoeSignUppage extends GreentoeBasclass
{
@FindBy(xpath="/html/body/div[1]/div[1]/div/div[3]/div[3]/div/a[2]")
public static WebElement signup_link;

@FindBy(xpath="//*[@id=\"signup_email\"]")
public static WebElement signup_email;

@FindBy(xpath="//*[@id=\"signup_password\"]")
public static WebElement signup_password;

@FindBy(xpath="//*[@id=\"signup_password_confirmation\"]")
public static WebElement signup_confirm_password;

@FindBy(xpath="//*[@id=\"recaptcha-anchor-label\"]")
public static WebElement signup_capcha_checkbox;

@FindBy(xpath="//*[@id=\"signup-form\"]/input[4]")
public static WebElement signup_btn;

//login throw google account

@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/a[2]")
public static WebElement signup_using_google_link;

@FindBy(xpath="//*[@id=\"identifierId\"]")
public static WebElement signup_using_google_accountusername;

@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
public static WebElement signup_using_google_clicknext_btn;

@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
public static WebElement signup_using_google_account_password;

@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/span")
public static WebElement signup_using_google_passwordNext_btn;



public static void signupusinggoogleaccount()
{
	click(GreeentoeSignUppageObject.signup_link);
	click(GreeentoeSignUppageObject.signup_using_google_link);
	sendkey(GreeentoeSignUppageObject.signup_using_google_accountusername, "anveshsamala5949@gmail.com");
	click(GreeentoeSignUppageObject.signup_using_google_clicknext_btn);
	sendkey(GreeentoeSignUppageObject.signup_using_google_account_password, "Rahul123@");
	click(GreeentoeSignUppageObject.signup_using_google_passwordNext_btn);
}

}
