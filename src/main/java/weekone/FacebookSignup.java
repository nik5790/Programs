package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElementByName("firstname").sendKeys("Neeraj");
		driver.findElementByName("lastname").sendKeys("Lalotra");
		driver.findElementByName("reg_email__").sendKeys("neerajlalotra@gmail.com");
		driver.findElementByName("reg_email_confirmation__").sendKeys("neerajlalotra@gmail.com");
		driver.findElementByName("reg_passwd__").sendKeys("12345678");
		driver.findElementByXPath("//*[@id='u_0_7']").click();
		driver.findElementByName("websubmit").click();
	}
}
