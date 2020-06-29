package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class BureauImmigrationSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		driver.manage().window().maximize();

		driver.findElementByLinkText("Sign Up (Registration)").click();
		driver.findElementById("u_id").sendKeys("Nick1234");
		driver.findElementById("u_pwd").sendKeys("123456@Abc");
		driver.findElementById("u_repwd").sendKeys("123456@Abc");
		driver.findElementById("u_secans").sendKeys("Jammu");
		driver.findElementById("u_name").sendKeys("Nick Paul");
		driver.findElementById("u_designation").sendKeys("Assistant Manager");
		driver.findElementById("u_emailid").sendKeys("nick2020@gmail.com");
		driver.findElementById("u_mobile").sendKeys("9988776655");
		driver.findElementById("u_phone").sendKeys("0119876521");
		driver.findElementById("name").sendKeys("Ajay Thakur");
		driver.findElementById("capacity").sendKeys("3");
		driver.findElementById("address").sendKeys("#123 Sector-13 Chandigarh near Aroma Chowk");
		driver.findElementById("email").sendKeys("ajay.thakur@icloud.com");
		driver.findElementById("mcontact").sendKeys("+91977977276");
		driver.findElementById("contact").sendKeys("0223456754");
		driver.findElementByName("name_o").sendKeys("Sukha");
		driver.findElementByName("address_o").sendKeys("#696 Mota singh nagar Jalandhar  Punjab India");
		driver.findElementByName("emailid_o").sendKeys("Sukha Sngh");
		driver.findElementByName("phoneno_o").sendKeys("0117612345");
		driver.findElementByName("mobile_o").sendKeys("9876512345");

	}

}
