package weektwo;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcBookHillRailways {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// Load the IRCTC URL - https://irctc.co.in
		driver.get("http://www.irctc.co.in");

		// Full screen Window
		driver.manage().window().maximize();

		driver.findElementByXPath(
				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(3000);

		// Mouse Over on Stays
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")
				.click();

		// Click on Lounge
		driver.findElementByLinkText("Lounge").click();
		Thread.sleep(5000);

		Set<String> allWinIdAfterLoungeClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterLoungeClick) {
			System.out.println("All window ID after Lounge Press: " + eachID);
			driver.switchTo().window(eachID);
		}

		// Click on Menu Bar at Top right Corner
		driver.findElementByXPath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]/i").click();
		Thread.sleep(3000);

		// Click on Hill Railways
		driver.findElementByLinkText("Hill Railways").click();
		Thread.sleep(3000);

		Set<String> allWinIdAfterHillRailwaysClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterHillRailwaysClick) {
			System.out.println("All window ID after Hilll railways click: " + eachID);
			driver.switchTo().window(eachID);
		}

		// Click on Book Now
		driver.findElementByXPath("//*[@id='test2']/div[1]/h3/a[3]").click();

		Set<String> allWinIdAfterBookNowClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterBookNowClick) {
			System.out.println("All window ID after book now click: " + eachID);
			driver.switchTo().window(eachID);
		}
		// Again Click on Book Now
		driver.findElementByXPath("/html/body/app-root/ng-component/div/div/div/div/a").click();
		Thread.sleep(3000);

		// Select Stating Date
		WebElement tourStartDate = driver.findElementByName("country");
		Select st = new Select(tourStartDate);
		st.selectByVisibleText("28-MAY-20");
		Thread.sleep(3000);

		// Select Boarding Station
		WebElement boardingStation = driver.findElementByName("boardst");
		Select bs = new Select(boardingStation);
		bs.selectByValue("KATPADI");
		Thread.sleep(3000);

		// Click on Continue
		driver.findElementByXPath(
				"/html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[3]/button")
				.click();
		Thread.sleep(3000);

		// Select Room 1 as (2 Adult + 1 Children withoutbed)
		WebElement selectAccommodationType = driver.findElementByXPath("//*[@id='selectID0']");
		Select at = new Select(selectAccommodationType);
		at.selectByVisibleText("2 Adult + 1 Child without bed (29380 /-)");
		Thread.sleep(3000);

		// Click on Continue
		driver.findElementByXPath(
				"/html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[4]/button")
				.click();
		Thread.sleep(10000);

		// Select Guest Login
		driver.findElementByXPath(
				"/html/body/app-root/booklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a").click();
		Thread.sleep(3000);

		// Enter User Email
		driver.findElementByXPath("//*[@id='modalpLRInput12']").sendKeys("ajay.thakur@gmail.com");
		Thread.sleep(3000);

		// Enter Mobile number
		driver.findElementByXPath("//*[@id='modalpLRInput13']").sendKeys("9797970000");
		Thread.sleep(3000);

		// Cick on Login button
		driver.findElementByXPath("//*[@id='gulogin-form']/div/div[3]/button").click();
		Thread.sleep(5000);

		// Enter First Name for 1 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/input")
				.sendKeys("Ajay");
		Thread.sleep(3000);

		// Enter Last Name for 1 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[2]/div/div[2]/input")
				.sendKeys("Thakur");
		Thread.sleep(3000);

		// Enter Adult Age for 1 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[3]/span/input")
				.sendKeys("30");
		Thread.sleep(3000);

		// Select Gender for 1 Passengers
		WebElement selectGenderP1 = driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[4]/select");
		Select gp1 = new Select(selectGenderP1);
		gp1.selectByValue("Male");
		Thread.sleep(3000);

		// Enter First Name for 2 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[1]/input")
				.sendKeys("Mohit");
		Thread.sleep(3000);

		// Enter Last Name for 2 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[2]/input")
				.sendKeys("Sharma");
		Thread.sleep(3000);

		// Enter Adult Age for 2 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[3]/span/input")
				.sendKeys("32");
		Thread.sleep(3000);

		// Select Gender for 2 Passengers
		WebElement selectGenderP2 = driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[4]/select");
		Select gp2 = new Select(selectGenderP2);
		gp2.selectByValue("Male");
		Thread.sleep(3000);

		// Enter First Name for 3 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[1]/input")
				.sendKeys("Esha");
		Thread.sleep(3000);

		// Enter Last Name for 3 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[2]/input")
				.sendKeys("Deol");
		Thread.sleep(3000);

		// Enter Adult Age for 3 Passengers
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[3]/input")
				.sendKeys("9");
		Thread.sleep(3000);

		// Select Gender for 3 Passengers
		WebElement selectGenderP3 = driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[4]/select");
		Select gp3 = new Select(selectGenderP3);
		gp3.selectByValue("Female");
		Thread.sleep(3000);

		// Enter Nominee Details
		driver.findElementByName("nomineeName").sendKeys("Madhuri Sharma");
		Thread.sleep(3000);

		// Enter Relation with passenger Details
		driver.findElementByName("RelationwithPassenger").sendKeys("Mother");
		Thread.sleep(3000);

		// Enter Contact Number
		driver.findElementByName("contactNo").sendKeys("9874561122");
		Thread.sleep(3000);

		// Enter Phone Number Under Contact Details
		driver.findElementByName("phoneNo").sendKeys("8544217700");
		Thread.sleep(3000);

		// Enter Fax Number
		driver.findElementByName("faxNo").sendKeys("+116588775222");
		Thread.sleep(3000);

		// Enter Address
		driver.findElementByXPath(
				"/html/body/app-root/passangers/main/div/section/div/div/form/div/div[6]/div[6]/input")
				.sendKeys("Sector 13 ,block D ,Near CP");
		Thread.sleep(3000);

		// Enter City
		driver.findElementByName("street").sendKeys("New Delhi");
		Thread.sleep(3000);

		// Select State
		WebElement selectState = driver.findElementByName("state");
		Select State = new Select(selectState);
		State.selectByValue("DELHI");
		Thread.sleep(3000);

		// Enter Nationality
		driver.findElementByName("nationality").sendKeys("INDIAN");
		Thread.sleep(3000);

		// Select Id Card Type
		WebElement selectIdCard = driver.findElementByName("idcardType");
		Select id = new Select(selectIdCard);
		id.selectByValue("7");
		Thread.sleep(3000);

		// Enter Id Card Number
		driver.findElementByName("idcardno").sendKeys("855423147895");
		Thread.sleep(3000);

		// Click On Submit
		driver.findElementByXPath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[7]/button[2]")
				.click();
		Thread.sleep(8000);

		// Get The Total Amount and Print in Console
		String totalAmount = driver
				.findElementByXPath(
						"/html/body/app-root/summery/main/div/section/div/div/form/div/div[5]/div[2]/div/table/tbody/tr[4]/td[2]")
				.getText();
		System.out.println("Total Amount of tour booking is: " + totalAmount);
		Thread.sleep(5000);

		// Close the Need Help? Ask Diksha
		driver.findElementById("corover-close-btn").click();
		Thread.sleep(3000);

		// Click On I Agree
		driver.findElementByXPath(
				"/html/body/app-root/summery/main/div/section/div/div/form/div/div[6]/div/div/label/span").click();
		Thread.sleep(3000);

		// Click On Make Payment
		driver.findElementByXPath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[7]/button[2]")
				.click();
		Thread.sleep(7000);

		// Print Transaction Id
		String transactionID = driver.findElementByXPath("//*[@id='payform']/div/div/div/div/div[1]/input")
				.getAttribute("value");
		System.out.println("Transaction ID number is: " + transactionID);
		Thread.sleep(3000);

		// Verify Transaction Amount
		String transactionAmount = driver.findElementByXPath("//*[@id='payform']/div/div/div/div/div[2]/input")
				.getAttribute("value");
		System.out.println("Transaction Amount is: " + transactionAmount);
		Thread.sleep(3000);

		if (totalAmount.replace("29380 (Inclusive Of GST)", "29380")
				.equals(transactionAmount.replace("29380.0", "29380"))) {
			System.out.println("Transaction amount is correct");
		} else {
			System.out.println("Transaction amount is incorrect");

		}

		// Close Application
		driver.quit();
	}

}
