package spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("highlight-book").click();

		driver.findElementById("ctl00_mainContent_rbtnl_Trip_0").click();

		driver.findElementById("ctl00_mainContent_ddl_originStation1_CTXT").click();
		driver.findElementById("ctl00_mainContent_ddl_originStation1_CTXT").sendKeys("Amritsar");

		driver.findElementById("ctl00_mainContent_ddl_destinationStation1_CTXT").click();

		driver.findElementById("ctl00_mainContent_ddl_destinationStation1_CTXT").sendKeys("CCU");

		driver.findElementById("ctl00_mainContent_view_date1").click();

		// driver.findElementByXPath("//a[@Class='ui-state-default'][Contains
		// text(),'26']");

		List<WebElement> dates = driver.findElementsByClassName("ui-state-default");
		// int dates =
		// driver.findElementsByClassName("ui-state-default").size();

		System.out.println("Total Number of dates:   " + dates.size());

		// for (WebElement dateList : dates) {
		// System.out.println("Date List is here: " + dateList.getText());

		// for (int i = 0; i < dates.size(); i++) {
		//
		// if
		// (driver.findElementsByClassName("ui-state-default").get(i).getText().contains("29"))
		// {
		// driver.findElementsByClassName("ui-state-default").get(i).click();
		// break;
		//
		// }
		// }
		
		
//		List<WebElement> month = driver.findElementsByClassName("ui-datepicker-month");
//		System.out.println("Total Number of months:   " + month.size());
//		for (WebElement monthList : month) {
//			System.out.println("Month List is here: " + monthList.getText());
//
//		}

		while (!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("September")) {
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		for (int i = 0; i < dates.size(); i++) {
			if (driver.findElements(By.cssSelector("a[class='ui-state-default']")).get(i).getText().contains("28")) {
				driver.findElements(By.cssSelector("a[class='ui-state-default']")).get(i).click();
				break;
			}
		}
	}
}
