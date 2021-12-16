package care.day10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class prong {
	
WebDriver driver;
	
	@BeforeMethod
	public void initializing(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL AHIRWAR\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Initializing the borwser");
		
	}
	
	@AfterMethod
	public void closingbrowser(){
		driver.quit();
	}
	
	//  Static memory Allocation
	 @DataProvider(name = "test1")
	public static Object[][] data(){
	Object[][] data = new Object[3][6];

	data[0][0] ="rohit";
	data[0][1]= "vishwakarma";
	data[0][2] ="rohitbca2019@gmail.com";
	data[0][3]= "rohit12";
	data[0][4] ="Abcd@123555!!$%";
	data[0][5]= "Abcd@123555!!$%";
	
	data[1][0] ="satyam";
	data[1][1]= "soni";
	data[1][2] ="satyam786ji@gmail.com";
	data[1][3]= "satyam786ji";
	data[1][4] ="Bcd@1234555!!$%";
	data[1][5]= "Bcd@1234555!!$%";
	
	data[2][0] ="varun";
	data[2][1]= "goutam";
	data[2][2] ="varun786ji@gmail.com";
	data[2][3]= "varun786ji";
	data[2][4] ="qwe@123A555!!$%";
	data[2][5]= "qwe@123A555!!$%";
	return data;

	}

	 @Test(dataProvider= "test1")
	public void ticketbooking(String n1, String n2, String n3, String n4, String n5, String n6 ) throws InterruptedException
	{
	
		driver.get("http://elearningm1.upskills.in");
		WebElement obj1 = driver.findElement(By.xpath("//a[text()=' Sign up! ']"));
		obj1.click();
	driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
	WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement Password1 = driver.findElement(By.xpath("//input[@name='pass1']"));
	WebElement Password2 = driver.findElement(By.xpath("//input[@name='pass2']"));
	
	Firstname.sendKeys(n1);
	Lastname.sendKeys(n2);
	Email.sendKeys(n3);
	Username.sendKeys(n4);
	Password1.sendKeys(n5);
	Password2.sendKeys(n6);
	Thread.sleep(2000);
	
	//Clicking on Register Button
	WebElement obj = driver.findElement(By.name("submit"));
	obj.click();
	Thread.sleep(2500);
	
	}
	
}
