package weekthree;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSaloonManadotryCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the IRCTC URL - https://www.irctc.co.in/nget/train-search
		driver.get("http://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);

		driver.findElementByXPath("//button[text()='Ok']").click();
		driver.findElementByLinkText("STAYS").click();
		Thread.sleep(3000);

		driver.findElementByXPath("(//span[text()='Lounge'])[1]").click();
		Thread.sleep(5000);

		Set<String> allWinIdAfterLoungeClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterLoungeClick) {
			System.out.println("All window id after lounge press " + eachID);
			driver.switchTo().window(eachID);
		}

		driver.findElementByXPath("//i[@class='fas fa-bars']").click();
		Thread.sleep(3000);

		driver.findElementByLinkText("Charter").click();
		Thread.sleep(3000);

		driver.findElementByLinkText("Enquiry Form").click();
		Thread.sleep(3000);

		driver.findElementByName("name").sendKeys("Bohemia");
		driver.findElementByName("organization").sendKeys("Rapstar");
		driver.findElementByName("address").sendKeys("California USA");
		driver.findElementByName("mobile").sendKeys("977977275");
		driver.findElementByName("email").sendKeys("Bohemia_USA@gmail.com");

		Select sCountry = new Select(driver.findElementByName("requestFor"));
		sCountry.selectByVisibleText("Saloon Charter");
		Thread.sleep(3000);

		driver.findElementByName("originStation").sendKeys("New Delhi");
		driver.findElementByName("destnStation").sendKeys("Jammu");
		driver.findElementByName("checkInDate").click();

		WebElement depYearSelection = driver.findElementByXPath("(//i[@class='fa fa-angle-double-right'])[1]");
		if (depYearSelection != null) {
			for (int i = 0; i <= 1; i++)
				depYearSelection.click();
			Thread.sleep(3000);

		}

		driver.findElementByXPath("(//i[@class='fa fa-angle-right'])[1]").click();
		Thread.sleep(3000);

		driver.findElementByXPath("(//span[text()='2'])[1]").click();
		Thread.sleep(3000);
		
		driver.findElementByName("checkOutDate").click();
		Thread.sleep(3000);


		WebElement arrivalYearSelection = driver.findElementByXPath("(//i[@class='fa fa-angle-double-right'])[2]");
		if (arrivalYearSelection != null) {
			for (int i = 0; i <= 1; i++)
				arrivalYearSelection.click();
			Thread.sleep(3000);

		}

		driver.findElementByXPath("(//i[@class='fa fa-angle-right'])[2]").click();
		Thread.sleep(3000);

		driver.findElementByXPath("(//span[text()='11'])[2]").click();
		Thread.sleep(3000);

		driver.findElementByName("durationPeriod").sendKeys("5");
		driver.findElementByName("coachDetails").sendKeys("1254, AC 3 Tier");

		driver.findElementByName("numPassenger").sendKeys("11");
		driver.findElementByName("charterPurpose").sendKeys("Saloon on Train Rocks");

		driver.findElementByName("charterPurpose").sendKeys("Saloon on Train Rocks");
		driver.findElementByName("services").sendKeys("Very fast");

		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		
		
		String alertMesssage = driver.findElementByXPath("//span[text()='Mobile no. not valid']").getText();

		if(alertMesssage.equals("Mobile no. not valid")){
			System.out.println("Validation Message:- "  +alertMesssage);
		}
			else
			{
				System.out.println("Enter Correct Phone Number");
			}
		}
	}

