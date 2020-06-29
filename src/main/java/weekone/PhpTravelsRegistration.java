package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelsRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://phptravels.org/register.php");
		driver.manage().window().maximize();

		driver.findElementById("inputFirstName").sendKeys("Neeraj");
		driver.findElementById("inputLastName").sendKeys("Thakur");
		driver.findElementById("inputEmail").sendKeys("neeraj.thaur@yahoo.com");
		driver.findElementById("inputPhone").sendKeys("1234567890");
		driver.findElementById("inputCompanyName").sendKeys("Selenium Autmation Pvt Ltd");
		driver.findElementByName("address1").sendKeys(" #123 Sector-17 Chandigarh UT ");
		driver.findElementByName("address2").sendKeys("near traffic light backside of Aroma Hotel");
		driver.findElementById("inputCity").sendKeys("Chandigarh");
		driver.findElementById("stateinput").sendKeys("Chandigarh");
		driver.findElementById("inputPostcode").sendKeys("123456");
		driver.findElementByName("customfield[2]").sendKeys("9988776655");
		driver.findElementByName("password").sendKeys("1234@abcd");
		driver.findElementByName("password2").sendKeys("1234@abcd");

	}

}
