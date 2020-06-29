package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRegisteration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[6]").click();
//		driver.findElementById("id='corover-close-btn'").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElementById("userName").sendKeys("Tomp1234");
		driver.findElementById("usrPwd").sendKeys("Tomp@1234");
		driver.findElementById("cnfUsrPwd").sendKeys("Tomp@1234");
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[4]/div[4]/input").sendKeys("Swift");
		driver.findElementById("firstName").sendKeys("Raja");
		driver.findElementById("middleName").sendKeys("Ram");
		driver.findElementById("lastname").sendKeys("Mohan");
		driver.findElementById("M").click();
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[10]/div[2]/label[1]/input").click();
		driver.findElementById("email").sendKeys("tomp1234@gmail.com");
		driver.findElementByName("resAddress1").sendKeys("1234, Block D");
		driver.findElementByName("resAddress2").sendKeys("Sector 11 Crossroad line");
		driver.findElementByName("resAddress3").sendKeys("near mobile market");
		driver.findElementByName("resPinCode").sendKeys("152202");
		driver.findElementById("resState").sendKeys("Chandigarh");
		driver.findElementById("resPhone").sendKeys("+91-9987566215");
		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[18]/div[2]/input").click();	
//		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[21]/div/input").click();
//		driver.findElementByXPath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[5]/form/div[23]/div[1]/button/b").click();

	
	}

}
