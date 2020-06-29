package wikipedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksPrint {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		
		
		Thread.sleep(5000);
		
		List <WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		//System.out.println(	link.get(322).getText());
		
	//	for loop
//		for (int i=0;i<link.size();i++)
//				{
//			System.out.println("Text of link    " +link.get(i).getText()+" -----------Hyperlink is    "+link.get(i).getAttribute("href"));
//				}
//		
	
		//For Each loop
		
		for(WebElement link1 : link){
			
			System.out.println("All link Text -  " +link1.getText()+"-----------"+ "Hyper link -  "+link1.getAttribute("href"));
			
		}

		
		
		
		
	}

}
