package weektwo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcDropdownData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElementByXPath(
				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]").click();
		Thread.sleep(5000);
		

		Select sc = new Select(driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[11]/div[2]/select"));
		List<WebElement> country = sc.getOptions();
		for(WebElement list: country  )
		{
		System.out.println("Country Name :   " + list.getText());
		
	}
		driver.quit();
}
}
