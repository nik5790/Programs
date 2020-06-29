package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinePassportRegisteration {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://passportconsult.com/");
	driver.manage().window().maximize();
	
	driver.findElementById("details-button").click();
	driver.findElementById("proceed-link").click();
	driver.findElementById("txt_firstname").sendKeys("Bhanu");
	driver.findElementById("txt_middlename").sendKeys("Partap");
	driver.findElementById("txt_lastname").sendKeys("Singh");
	driver.findElementById("txt_aadharno").sendKeys("123456789012");
	driver.findElementById("txt_place_birth").sendKeys("Jammu");
	driver.findElementById("txt_pan").sendKeys("ABCD1234F");
	driver.findElementById("txt_voter_id").sendKeys("123UPL048");
	driver.findElementById("txt_visible_dmark").sendKeys("Mole on right hand ");
	driver.findElementById("txt_Ffirstname").sendKeys("Sandeep ");
	driver.findElementById("txt_Fmiddlename").sendKeys("Kumar");
	driver.findElementById("txt_Flastname").sendKeys(" Thakur");
	driver.findElementById("txt_Mfirstname").sendKeys("Renu");
	driver.findElementById("txt_Mmiddlename").sendKeys("Devi");
	driver.findElementById("txt_Mlastname").sendKeys("Thakur");
	driver.findElementById("txt_Gfirstname").sendKeys("Prem");
	driver.findElementById("txt_Gmiddlename").sendKeys("Kumar");
	driver.findElementById("txt_Glastname").sendKeys("Thakur");
	driver.findElementById("txt_adr_res_house").sendKeys("Sector 22 Jammu");
	driver.findElementById("txt_adr_res_city").sendKeys("Kathua");
	driver.findElementById("txt_adr_res_pin").sendKeys("123005");
	driver.findElementById("txt_mobile").sendKeys("9876587871");
	driver.findElementById("txt_email").sendKeys("neeraj.thakur@gmail.com");
	driver.findElementByName("emergency_contact_add").sendKeys("sector 1 chandigarh near petrol pump ,india 123454");
	driver.findElementById("txt_emer_mobile").sendKeys("9877112340");
	driver.findElementById("txt_emer_email").sendKeys("hobbs123@gmail.com");
	driver.findElementById("disButton").click();
	
	

	
	
	
	
	

	}

}
