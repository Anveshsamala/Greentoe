package grentoepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import greentoeUtilities.GreentoeBasclass;

public class GreentoeWatchespage extends GreentoeBasclass
{
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/ul/li[5]/a")
	public static WebElement moveto_watches;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/ul/li[5]/ul/li[1]/a/img")
	public static WebElement moveto_men_watches;
	
	@FindBy(xpath="//*[@id=\"filters-container\"]/section[1]/div/ul/li[2]/label/span")
	public static WebElement moveto_men_watches_checkbox;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div[4]/div[7]/section/div[1]/div/div[2]/div/div/h2/a")
	public static WebElement moveto_men_watches_specificwatch;
	
	@FindBy(xpath="//*[@id=\"offer-form\"]/input[2]")
	public static WebElement moveto_men_watches_amount_textbox;
	
	@FindBy(xpath="//*[@id=\"offer-widget\"]/div[5]/button")
	public static WebElement moveto_men_watches_continue_btn;
	
	@FindBy(xpath="//input[@id='user_email']")
	public static WebElement moveto_men_watches_emailid;
	
	@FindBy(xpath="//input[@id='user_fname']")
	public static WebElement moveto_men_watches_firstname;
	
	@FindBy(xpath="//input[@id='user_lname']")
	public static WebElement moveto_men_watches_lastname;
	
	@FindBy(xpath="//input[@id='user_phone_number']")
	public static WebElement moveto_men_watches_phonenumber;
	
	@FindBy(xpath="//input[@id='shipping_address_fullname']")
	public static WebElement moveto_men_watches_fullname;
	
	@FindBy(xpath="//input[@id='shipping_address_line1']")
	public static WebElement moveto_men_watches_line1;
	
	@FindBy(xpath="//input[@id='shipping_address_line2']")
	public static WebElement moveto_men_watches_line2;
	
	@FindBy(xpath="//input[@id='shipping_address_city']")
	public static WebElement moveto_men_watches_address_city;
	
	@FindBy(xpath="//*[@id=\"checkout-contact-information\"]/div[2]/div/div/section[1]/div/div/div[4]/div[2]/select")
	public static WebElement moveto_men_watches_address_statedropdown;
	
	@FindBy(xpath="//*[@id=\"checkout-contact-information\"]/div[2]/div/div/section[1]/div/div/div[4]/div[2]/select/option[44]")
	public static WebElement moveto_men_watches_address_statetelangana;
	
	@FindBy(xpath="//*[@id=\"shipping_address_zipcode\"]")
	public static WebElement moveto_men_watches_address_zipcode;
	
	@FindBy(xpath="//input[@id=\"user_password\"]")
	public static WebElement moveto_men_watches_address_password;
	
	@FindBy(xpath="//*[@id=\"user_password_confirmation\"]")
	public static WebElement moveto_men_watches_password_confirmation;
	
	@FindBy(xpath="//*[@id=\"checkout-submit-btn\"]")
	public static WebElement moveto_men_watches_submit_btn;
	
	
	public static void greetoeWatch() throws InterruptedException
	{
		moveToElement(GreentoeWatchespage.moveto_watches);
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches);
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_checkbox);
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_specificwatch);
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_amount_textbox, "500");
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_continue_btn);
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_emailid, "anveshsamala5949@gmail.com");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_firstname, "samala");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_lastname, "anvesh");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_phonenumber, "8499099085");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_fullname, "samalaanvesh");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_line1, "jungedu");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_line2, "warangal");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_address_city, "chennai");
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_address_statedropdown);
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_address_statetelangana);
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_address_zipcode, "600001");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_address_password, "Rahul123@");
		Thread.sleep(1000);
		sendkey(GreentoeWatchespage.moveto_men_watches_password_confirmation, "Rahul123@");
		Thread.sleep(1000);
		click(GreentoeWatchespage.moveto_men_watches_submit_btn);
		
	}
}
