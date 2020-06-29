package weektwo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormCDetails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Load the FORM-C URL
		driver.get("http://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		
		//Click on Sign Up (Registration)
		driver.findElementByLinkText("Sign Up (Registration)").click();
		
		//Enter User Id
		driver.findElementById("u_id").sendKeys("Christina55");
		
		//Enter Password
		driver.findElementById("u_pwd").sendKeys("Test@1234");
		
		//Enter Confirm Password
		driver.findElementById("u_repwd").sendKeys("Test@1234");
		
		//Select Security Question
		Select ques = new Select(driver.findElementById("u_secques"));
		ques.selectByValue("4");
		Thread.sleep(3000);

		
		//Enter Your Answer
		driver.findElementById("u_secans").sendKeys("Kahanpur");
		
		//Enter Name
		driver.findElementById("u_name").sendKeys("Christina Juli");
		
		//Select Gender
		Select gender = new Select(driver.findElementById("u_gender"));
		gender.selectByValue("F");
		Thread.sleep(3000);

		
		
		//Select DOB
		driver.findElementById("u_dob").sendKeys("06/05/2003");
		
		//Enter Designation
		driver.findElementById("u_designation").sendKeys("CTO");
		//Enter Email Id
		driver.findElementById("u_emailid").sendKeys("christy55@gmail.com");
		
		//Enter Mobile Number
		driver.findElementById("u_mobile").sendKeys("8540264511");
		
		//Enter Phone Number 
		driver.findElementById("u_phone").sendKeys("0186789456");
		
		//Enter Name
		driver.findElementById("name").sendKeys("Vidyut Thakur");
//		Enter Capacity
		driver.findElementById("capacity").sendKeys("2");
		
//		Enter Address
		driver.findElementById("address").sendKeys("sco173,sadar bazar new delhi");
		
//		Select State
		Select State = new Select(driver.findElementById("state"));
		State.selectByValue("34");
		Thread.sleep(3000);

//		Select City/District
		Select City = new Select(driver.findElementById("city_distr"));
		City.selectByValue("71D");
		Thread.sleep(3000);
		
//		Select Accomodation Type
		Select Type = new Select(driver.findElementById("acco_type"));
		Type.selectByValue("H");
		Thread.sleep(3000);

		
//		Select Accomodation Grade
		Select Grade = new Select(driver.findElementById("star_rat"));
		Grade.selectByValue("5s");
		Thread.sleep(3000);

		
		
//		Enter Email Id
		driver.findElementById("email").sendKeys("Vidyut.thakur@yahoo.com");
		
//		Enter Mobile Number
		driver.findElementById("mcontact").sendKeys("+9465870001");
		
//		Enter Phone Number 
		driver.findElementById("contact").sendKeys("0112569801");
		
		//Enter Passenger Name for 1st person
		driver.findElementByName("name_o").sendKeys("Ranbir");
		
		//Enter Passenger Address for 1st person
		driver.findElementByName("address_o").sendKeys(" Jalandhar  Punjab India");
		
		//Select State for 1st person
		Select State1 = new Select (driver.findElementById("state_o"));
		State1.selectByVisibleText(" PUNJAB");
		Thread.sleep(3000);

		
		//Select District for 1st person
		Select District1 = new Select (driver.findElementById("citydistr_o"));
		District1.selectByVisibleText("JALANDHAR");
		Thread.sleep(3000);

		
		//Enter Passenger Email Id for 1st person
		driver.findElementByName("emailid_o").sendKeys("ranbir.singh@gmail.com");
		
		//Enter Passenger Phone Number for 1st person
		driver.findElementByName("phoneno_o").sendKeys("0117612345");
		
		//Enter Passenger mobile Number for 1st person
		driver.findElementByName("mobile_o").sendKeys("9876512345");
		
		//Click on Add button
		driver.findElementByName("add").click();
		
		
		//Enter Passenger Name for 2nd person
		driver.findElementByName("name_o").sendKeys("Rajbir");
		
		//Enter Passenger Address for 2nd person
		driver.findElementByName("address_o").sendKeys(" Amritsar Punjab India");
		
		//Select State for 2nd person
		Select State2 = new Select (driver.findElementById("state_o"));
		State1.selectByVisibleText(" PUNJAB");
		Thread.sleep(3000);

		
		//Select District for 2nd person
		Select District2 = new Select (driver.findElementById("citydistr_o"));
		District2.selectByValue("7C");
		Thread.sleep(3000);

		
		//Enter Passenger Email Id for 2nd person
		driver.findElementByName("emailid_o").sendKeys("rajbir.kaur@yahoo.com");
		
		//Enter Passenger Phone Number for 2nd person
		driver.findElementByName("phoneno_o").sendKeys("0224569524");
		
		//Enter Passenger mobile Number for 2nd person
		driver.findElementByName("mobile_o").sendKeys("7854566522");
		
		//Click on Add button
		driver.findElementByName("add").click();
		
		
		//Enter Passenger Name for 3rd person
		driver.findElementByName("name_o").sendKeys("raunak");
		
		//Enter Passenger Address for 3rd person
		driver.findElementByName("address_o").sendKeys(" baga beach Goa UT India");
		
		//Select State for 3rd person
		Select State3 = new Select (driver.findElementById("state_o"));
		State3.selectByValue("9");
		Thread.sleep(3000);

		
		//Select District for 3rd person
		Select District3 = new Select (driver.findElementById("citydistr_o"));
		District3.selectByValue("15C");
		Thread.sleep(3000);
		
		//Click on Add button
		driver.findElementByName("add").click();

		//Close Application
		driver.quit();
	}

}
