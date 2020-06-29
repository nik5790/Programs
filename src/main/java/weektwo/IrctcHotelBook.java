package weektwo;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcHotelBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.findElementByXPath(
				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(3000);

		// Mouse Hover to stays
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")
				.click();

		// Click on Lounge
		driver.findElementByLinkText("Lounge").click();
		Thread.sleep(5000);

		Set<String> allWinIdAfterLoungeClick = driver.getWindowHandles();

		for (String eachID : allWinIdAfterLoungeClick) {
			System.out.println("All window id after loungs press " + eachID);
			driver.switchTo().window(eachID);

		}
		// Click on IRCTC Hotels Icon
		driver.findElementByLinkText("IRCTC Hotels").click();
		Thread.sleep(3000);

		Set<String> allWinIdAfterHotelIconClick = driver.getWindowHandles();

		for (String eachID : allWinIdAfterHotelIconClick) {
			System.out.println("All window id after Hote Icon press " + eachID);
			driver.switchTo().window(eachID);

		}
		Thread.sleep(6000);

		// Click on Login
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/homeheader/nav/div/div[3]/a/a").click();
		Thread.sleep(3000);

		// Click on Guest User Login
		driver.findElementByXPath("//*[@id='LoginFormPopup']/app-loginmodal/div/div/div/ul/li[2]/a").click();
		Thread.sleep(3000);

		// Enter Email Id
		driver.findElementByXPath("//*[@id='modalLRInput12']").sendKeys("nickpaul@gmail.com");

		// Enter Mobile Number
		driver.findElementByXPath("//*[@id='modalLRInput13']").sendKeys("9779712345");

		// Click on Sign in
		driver.findElementByXPath("//*[@id='panel8']/div[1]/form/div[3]/button").click();
		Thread.sleep(3000);

		// driver.findElementByXPath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/input").click();

		// Select Destination
		driver.findElementByXPath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/input").sendKeys("New Delhi");
		Thread.sleep(3000);

		// Select city
		driver.findElementByXPath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/div/ul/li/a/div[1]/span")
				.click();
		Thread.sleep(3000);

		// Select Check In Date
		driver.findElementByName("dt12").click();
		Thread.sleep(2000);

		driver.findElementByXPath(
				"//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[6]/span")
				.click();
		Thread.sleep(2000);

		// Select Check Out Date
		driver.findElementByName("dt13").click();
		Thread.sleep(2000);

		driver.findElementByXPath(
				"//*[@id='owl-dt-picker-1']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[6]/td[1]/span")
				.click();
		Thread.sleep(2000);

		driver.findElementById("user-data-wrapper-id").click();

		// Select Room as 1
		WebElement element = driver.findElementByName("hotelRoom");
		Select room = new Select(element);
		room.selectByValue("1");
		Thread.sleep(3000);

		// Select Adults as 3
		WebElement element1 = driver.findElementByName("hotelAdult");
		Select adult = new Select(element1);
		adult.selectByVisibleText("3");
		Thread.sleep(3000);

		// Click on Done
		driver.findElementByXPath("//*[@id='user-data-wrapper']/div[2]/button").click();

		// Click on Find Hotel
		driver.findElementByXPath("//*[@id='TravellerEconomydropdown']/div[5]/button").click();
		Thread.sleep(10000);

		// Click on Book (On first displayed Hotel)
		driver.findElementByXPath(
				"/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button")
				.click();
		Thread.sleep(3000);

		// Get the Hotel Name and Print in Console
		String hotelName = driver
				.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3/a")
				.getText();
		System.out.println("The Name of booked Hotel is: " + hotelName);
		Thread.sleep(3000);

		// Get the Price and Print in Console
		String hotelPrice = driver
				.findElementByXPath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/p").getText();
		System.out.println("The price of booked Hotel per night is: " + hotelPrice);
		Thread.sleep(3000);

		// Click on Continue to Book
		driver.findElementByXPath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/div[4]/button")
				.click();
		Thread.sleep(5000);

		// Select Title
		WebElement selectTitle = driver.findElementByName("title");
		Select Title = new Select(selectTitle);
		Title.selectByValue("1");
		Thread.sleep(3000);

		// Enter First Name
		driver.findElementByName("firstName").sendKeys("Govinda");
		Thread.sleep(3000);

		// Enter Last Name
//		driver.findElementByName("lastName").sendKeys("Patel");

		driver.findElementByName("lastName").sendKeys("Kumar");
		Thread.sleep(3000);

		// Enter Mobile Number
		driver.findElementByXPath(
				"/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[4]/div/input")
				.clear();
		driver.findElementByXPath(
				"/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[4]/div/input")
				.sendKeys("8654033458");
		Thread.sleep(3000);

		// Enter Email Id
		driver.findElementByXPath(
				"/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[5]/div/input")
				.clear();
		driver.findElementByXPath(
				"/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[5]/div/input")
				.sendKeys("govindakumar@gmail.com");
		
		//Select GST as Yes
		WebElement selectGST = driver.findElementByName("gst");
		Select GST = new Select(selectGST);
		GST.selectByValue("Yes");
		Thread.sleep(3000);
		
		//Enter Company Name
		driver.findElementByName("companyName").sendKeys("IRCTC India Pvt Ltd");
		Thread.sleep(3000);
		
		//Enter Company Name
		driver.findElementByName("companyAddress").sendKeys("IRCTC Head Office,Baramkhamba road ,New Delhi");
		Thread.sleep(3000);
		
		//Click On Go
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[10]/button[2]").click();
		Thread.sleep(3000);

		
		//Verify Validation Message
		boolean Verify = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[7]/div/span").isDisplayed();
	
		System.out.println("gstNumber field is required. " +Verify);
	
	
	}

}
