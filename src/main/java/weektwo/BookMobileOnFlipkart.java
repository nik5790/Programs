package weektwo;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMobileOnFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(" http://www.flipkart.com/");
		Thread.sleep(5000);

		// Enter Email Id
		driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
				.sendKeys("neerajlalotra90@gmail.com");
		Thread.sleep(2000);

		// Enter Password
		driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
				.sendKeys("classic@350");
		Thread.sleep(3000);

		// Click on Login
		driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button").click();
		Thread.sleep(5000);

		// Search For Any Mobile
		driver.findElementByName("q").sendKeys("samsung mobile");
		Thread.sleep(3000);

		driver.findElementByClassName("vh79eN").click();
		Thread.sleep(3000);

		// Click on the First Displayed Mobile
		driver.findElementByXPath(
				"//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
				.click();
		Thread.sleep(5000);

		Set<String> allWinIdAfterClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterClick) {
			System.out.println(eachID);
			driver.switchTo().window(eachID);

		}
		Thread.sleep(3000);

		// Get the Title of the Mobile
		String mobileTitle = driver.findElementByClassName("_35KyD6").getText();
		System.out.println("The title of Mobile is:" + mobileTitle);
		Thread.sleep(2000);

		// Get The Amount of the Mobile
		String mobilePrice = driver
				.findElementByXPath(
						"//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")
				.getText();
		System.out.println("The Price of Mobile is:" + mobilePrice);
		Thread.sleep(3000);

		// Click on Change pincode
		driver.findElementByXPath(
				"//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div/span")
				.click();
		Thread.sleep(3000);

		WebElement pinCode = driver.findElementByXPath("//*[@id='pincodeInputId']");
		pinCode.sendKeys("133001");
		Thread.sleep(2000);

		// select from recent list
		driver.findElementByXPath(
				"//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div[2]/ul[1]/li/div")
				.click();

		// check the pin code
		driver.findElementByXPath(
				"//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")
				.click();
		Thread.sleep(3000);

		// Click on Add to Cart
		driver.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
				.click();
		Thread.sleep(3000);

		// Get The Amount and Compare after adding to cart
		// _10vVqD
		String getPrice = driver
				.findElementByXPath(
						"//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/span/div/div/span")
				.getText();
		System.out.println("Price of mobile after adding to cart is:" + getPrice);
		Thread.sleep(3000);

		// Get The Title and Compare after adding to cart
		String getTitle = driver.findElementByLinkText("Samsung Galaxy A10s (Black, 32 GB)").getText();
		System.out.println("Tite of mobile after adding to cart is:" + getTitle);

		
		if (mobilePrice.equals(getPrice)) {
			System.out.println("Mobile Price matched: " +getPrice);
		} else {
			System.out.println("Mobile Price not  matched: " +getPrice);

		}

		if (mobileTitle.equals(getTitle)) {
			System.out.println("Mobile Title matched: " + getTitle);
		} else {
			System.out.println("Mobile Title not  matched: " + getTitle);

		}

		//close the app
		driver.quit();
	}
}