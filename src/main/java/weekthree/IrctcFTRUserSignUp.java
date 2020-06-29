package weekthree;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcFTRUserSignUp {

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

		driver.findElementByLinkText("Book Your Coach/Train").click();
		Thread.sleep(3000);

		Set<String> allWinIdAfterTrainBookClick = driver.getWindowHandles();
		for (String eachID : allWinIdAfterTrainBookClick) {
			System.out.println("All window id after Book Your Coach/Train  press " + eachID);
			driver.switchTo().window(eachID);
		}
		driver.findElementByLinkText("New User? Signup").click();
		Thread.sleep(3000);

		driver.findElementById("userId").sendKeys("tyson8099");
		driver.findElementById("password").sendKeys("Tyson8099");
		driver.findElementById("cnfPassword").sendKeys("Tyson8099");

		Select Ques = new Select(driver.findElementById("secQstn"));
		Ques.selectByValue("6");

		driver.findElementById("secAnswer").sendKeys("bike");

		WebElement dob = driver.findElementById("dateOfBirth");
		dob.click();
		Thread.sleep(3000);

		Select month = new Select(driver.findElementByClassName("ui-datepicker-month"));
		month.selectByValue("7");
		Thread.sleep(3000);

		Select year = new Select(driver.findElementByClassName("ui-datepicker-year"));
		year.selectByValue("2001");
		Thread.sleep(3000);

		driver.findElementByLinkText("7").click();

		driver.findElementById("gender0").click();

		driver.findElementById("maritalStatus0").click();

		driver.findElementById("email").sendKeys("tyson8099@yahoo.com");

		WebElement occupation = driver.findElementById("occupation");

		Select soccupation = new Select(occupation);
		soccupation.selectByVisibleText("Professional");

		driver.findElementById("fname").sendKeys("Tyson");
		driver.findElementById("mname").sendKeys("Kumar");
		driver.findElementById("lname").sendKeys("Singh");

		Select sNationality = new Select(driver.findElementById("natinality"));
		sNationality.selectByVisibleText("Indian");

		driver.findElementById("flatNo").sendKeys("1432");
		driver.findElementById("street").sendKeys("Gandhi Chowk");
		driver.findElementById("area").sendKeys("Defence Road");
		Thread.sleep(3000);

		Select sCountry = new Select(driver.findElementById("country"));
		sCountry.selectByVisibleText("India");
		Thread.sleep(3000);


		driver.findElementById("mobile").sendKeys("7009892327");
		driver.findElementById("pincode").sendKeys("160055");
		driver.findElementById("pincode").sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(6000);

		WebElement City = driver.findElementById("city");	
		City.click();
		Thread.sleep(3000);

		Select sCity = new Select(City);
		sCity.selectByValue("Rupnagar");
		
		WebElement State = driver.findElementById("state");		
		Select sState = new Select(State);
		sState.selectByValue("PUNJAB");

		Select sPostOffice = new Select(driver.findElementById("postOffice"));
		sPostOffice.selectByValue("Chandigarh Sector 55 S.O");
		Thread.sleep(3000);


		driver.findElementById("sameAddresses1").click();

		driver.findElementById("flatNoOffice").sendKeys("1563 Block C");
		driver.findElementById("streetOffice").sendKeys("JP Road");
		driver.findElementById("areaOffice").sendKeys("Gobind Nagar");

		Select sCountry1 = new Select(driver.findElementById("countryOffice"));
		sCountry1.selectByVisibleText("India");
		Thread.sleep(3000);


		driver.findElementById("mobileOffice").sendKeys("9779772575");
		driver.findElementById("pincodeOffice").sendKeys("145001");
		driver.findElementById("pincode").sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(6000);

		
		WebElement officeCity = driver.findElementById("cityOffice");
		officeCity.click();
		Thread.sleep(3000);

		Select sOfficeCity = new Select(officeCity);
		sOfficeCity.selectByVisibleText("Gurdaspur");

		Select sOfficeState = new Select(driver.findElementById("stateOffice"));
		sOfficeState.selectByVisibleText("PUNJAB");

		Select sOfficePostOffice = new Select(driver.findElementById("postOfficeOffice"));
		sOfficePostOffice.selectByVisibleText("Dalhousie Road Pathankot S.O");

	}

}
