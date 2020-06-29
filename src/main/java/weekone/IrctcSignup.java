package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.ftr.irctc.co.in/ftr/");
		driver.findElementByLinkText("New User? Signup").click();
		driver.findElementById("userId").sendKeys("Nickp1234");
		driver.findElementById("password").sendKeys("Nickp@1234");
		driver.findElementById("cnfPassword").sendKeys("Nickp@1234");
		driver.findElementById("secAnswer").sendKeys("Royal Enfield");
		driver.findElementByXPath("//*[@id='gender0']").click();
		driver.findElementByXPath("//*[@id='maritalStatus0']").click();
		driver.findElementById("email").sendKeys("nickp1234@gmail.com");
		driver.findElementById("fname").sendKeys("Nick");
		driver.findElementById("mname").sendKeys("Paul");
		driver.findElementById("lname").sendKeys("Smith");
		driver.findElementById("flatNo").sendKeys("1234");
		driver.findElementByXPath("//*[@id='street']").sendKeys("Sector 13 ,Chandigarh");
		driver.findElementById("area").sendKeys(" near ISBT bus stand");
		driver.findElementById("mobile").sendKeys("9779771234");

	}

}
