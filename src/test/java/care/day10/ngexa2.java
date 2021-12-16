package care.day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class ngexa2 {
	
	WebDriver driver;
	@Test(groups={"ticketbooking","regression"})
	public void ticketbooking()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL AHIRWAR\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	System.out.println("this is my test case 1");


	}

	@Test(groups={"smoke"})
	public void statuscheck() throws InterruptedException
	{
	//driver.get("https://www.google.com/");
	Thread.sleep(5000);
	System.out.println("this is my test case 2");

	}

}
