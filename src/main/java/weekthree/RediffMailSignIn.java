package weekthree;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailSignIn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);

//		WebElement user = driver.findElementById("login1");
//		WebElement pswd = driver.findElementById("password");
//		WebElement signIn = driver.findElementByName("proceed");

		String username = null;
		String password1 = null;
		for (int i = 1; i <= 5; i++) {

			if (i == 1) {
				username = "neeraj123@gmail.com";
				password1 = "neeraj@1234";

			} else if (i == 2) {
				username = "rahul123@rediffmail.com";
				password1 = "rahul1234";

			} else if (i == 3) {
				username = "Samar123@rediffmail.com";
				password1 = "Samar1234";

			} else if (i == 4) {
				username = "Sumit@rediffmail.com";
				password1 = "Sumit1234";

			} else {
				username = "Pawan123@rediffmail.com";
				password1 = "Pawan1234";
			}

//			user.clear();
//			user.sendKeys(username);
			
			driver.findElementById("login1").clear();
			driver.findElementById("login1").sendKeys(username);
			Thread.sleep(3000);

//			pswd.clear();
//			pswd.sendKeys(password1);
			
			driver.findElementById("password").clear();
			driver.findElementById("password").sendKeys(password1);
			Thread.sleep(3000);

//			signIn.click();
			
			
			driver.findElementByName("proceed").click();
			Thread.sleep(3000);

			WebElement alertMsg = driver.findElementById("div_login_error");

			if (alertMsg != null) {
				System.out.println("Display message:-" + alertMsg.getText());

			} else {
				System.out.println("Login Successfull");

			}
		}

	}
}
