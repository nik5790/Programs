package wikipedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		// saving the GUI element reference into a "element" variable of WebElement type
		WebElement element = driver.findElement(By.id("identifierId"));
		
		
		// entering username
		element.sendKeys("neeraj.lalotra.nextgen@gmail.com");
		element.sendKeys(Keys.RETURN);
		
		//Press Next button
		 driver.findElement(By.xpath("//span[Contains(text(),'Next')]"));
		
		// entering password
		driver.findElement(By.id("Passwd")).sendKeys("Classic@350");
		
		// clicking signin button
		driver.findElement(By.id("signIn")).click();
		
		
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

}
