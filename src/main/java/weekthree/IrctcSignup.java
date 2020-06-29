package weekthree;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the IRCTC URL - https://www.irctc.co.in/nget/train-search
		driver.get("http://www.irctc.co.in/nget/train-search");
		Thread.sleep(8000);
		// Close Help me disha
		// driver.findElementById("corover-close-btn").click();
		// Thread.sleep(3000);

		// Handle Alert
		WebElement alert = driver.findElementByXPath("//button[contains(text(),'Ok')]");

		// Page Scroll up
		// alert.sendKeys(Keys.PAGE_DOWN);
		// Thread.sleep(3000);

		alert.click();
		Thread.sleep(5000);

		// Click on Register
		driver.findElementByLinkText("REGISTER").click();
		Thread.sleep(3000);

		// Enter Username
		driver.findElementById("userName").sendKeys("Mike0001");

		// Enter Password
		driver.findElementById("usrPwd").sendKeys("Mike1234");
		Thread.sleep(3000);

		// Enter confirm Password
		driver.findElementById("cnfUsrPwd").sendKeys("Mike1234");
		Thread.sleep(3000);

		driver.findElementByXPath("//label[text()='Select Security Question']").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//span[contains(text(),'What make was your first car or bike?')]").click();
		driver.findElementByXPath("//input[@formcontrolname='secAns']").sendKeys("bike");
		Thread.sleep(3000);
		driver.findElementByXPath("//label[text()='Select Preferred Language']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='English']").click();

		driver.findElementById("firstName").sendKeys("Rambo");
		driver.findElementById("middleName").sendKeys("Jatt");
		driver.findElementById("lastname").sendKeys("Punjab");

		driver.findElementById("M").click();
		Thread.sleep(3000);

		driver.findElementByXPath(
				"//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/input")
				.click();
		Thread.sleep(3000);

		WebElement calendarMonth = driver.findElementByXPath(
				"//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/div/div/div/select[1]");
		Select selectmonth = new Select(calendarMonth);
		selectmonth.selectByValue("7");
		Thread.sleep(3000);

		WebElement calendarYear = driver.findElementByXPath(
				"//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[9]/div[2]/p-calendar/span/div/div/div/select[2]");
		Select selectYear = new Select(calendarYear);
		selectYear.selectByVisibleText("1990");

		driver.findElementByLinkText("9").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//label[text()='Select Occupation']").click();
		Thread.sleep(3000);

		driver.findElementByXPath("//span[text()='PRIVATE']").click();
		Thread.sleep(3000);

		driver.findElementByXPath(
				"//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[1]/input")
				.click();
		Thread.sleep(3000);

		driver.findElementById("email").sendKeys("sumit987@gmail.com");
		Thread.sleep(3000);

		driver.findElementById("mobile").sendKeys("9779772757");
		Thread.sleep(3000);

		WebElement nationality = driver.findElementByXPath("//select[@formcontrolname='nationality']");
		Select snationality = new Select(nationality);
		snationality.selectByValue("94");
		Thread.sleep(3000);

		driver.findElementById("resAddress1").sendKeys("144");
		driver.findElementById("resAddress2").sendKeys("MG ROAD");
		driver.findElementById("resAddress3").sendKeys("Shastri Nagar");
		driver.findElementByName("resPinCode").sendKeys("144221");
		driver.findElementById("resState").click();
		Thread.sleep(3000);

		WebElement city = driver.findElementByXPath("//select[@formcontrolname='resCity']");
		Select scity = new Select(city);
		scity.selectByValue("Hoshiarpur");
		Thread.sleep(3000);

		WebElement postOffice = driver.findElementByXPath("//select[@formcontrolname='resPostOff']");
		Select spostOffice = new Select(postOffice);
		spostOffice.selectByValue("Dagon B.O");
		Thread.sleep(3000);

		driver.findElementById("resPhone").sendKeys("9884564453");
		Thread.sleep(3000);

		driver.findElementByXPath("(//input[@formcontrolname='officeSameAsRes'])[2]").click();
		Thread.sleep(3000);

		// Office Address

		driver.findElementById("offAddress1").sendKeys("108");
		driver.findElementById("offAddress2").sendKeys("Dhangu ROAD");
		driver.findElementById("offAddress3").sendKeys("Moti Nagar");
		driver.findElementByName("offPinCode").sendKeys("160055");
		Thread.sleep(3000);

		driver.findElementById("offState").click();
		Thread.sleep(3000);

		WebElement officecity = driver.findElementByXPath("//select[@formcontrolname='offCity']");
		Select sofficecity = new Select(officecity);
		sofficecity.selectByValue("Rupnagar");
		Thread.sleep(3000);

		WebElement officePO = driver.findElementByXPath("//select[@formcontrolname='offPostOff']");
		Select sofficePO = new Select(officePO);
		sofficePO.selectByValue("Chandigarh Sector 56 S.O");
		Thread.sleep(3000);

		driver.findElementById("offPhone").sendKeys("8699784255");
		Thread.sleep(3000);
		
		driver.findElementById("corover-close-btn").click();
		Thread.sleep(5000);
		

		WebElement term1 = driver.findElementByXPath("//input[@formcontrolname='termCondition']");
		term1.sendKeys(Keys.ARROW_DOWN);
		term1.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);
		term1.click();
	}
}
