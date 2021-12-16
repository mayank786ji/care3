package care.day10;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class finalselenium {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
					
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		WebElement uname = driver.findElement(By.name("login"));
		WebElement pname = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='mayank786ji';",uname);
		js.executeScript("arguments[0].value='Mayank@99';",pname);
		
		
		// Clicking on submit Button
		WebElement obj = driver.findElement(By.name("submitAuth"));
		obj.click();
		
		// Clicking on submit Button
				WebElement obj1 = driver.findElement(By.xpath("//a[text()='Compose']"));
				obj1.click();
		
			//  select send to 
				
				
				
				//WebElement sto = driver.findElement(By.className("select2-search__field"));
				WebElement ss = driver.findElement(By.name("title"));
				WebElement ddd = driver.findElement(By.id("file-descrtiption"));
				//js.executeScript("arguments[0].value='vir';",sto);
				Thread.sleep(3000);
				//WebElement obj3= driver.findElement(By.xpath("//li[contains(text(),'virat kohli')]"));
				//obj3.click();
				//((Select) obj3).selectByValue("virat kohli (virat)");
				//driver.findElement(By.xpath("//li[contains(text(),'virat kohli')]")).sendKeys("virat kohli (virat)");
				js.executeScript("arguments[0].value='INTERVIEW';",ss);
				js.executeScript("arguments[0].value='After reviewing your application, we have decided to select you for the next round. I am thrilled to invite you for a job interview [softwarte test engineer: at our office / via phone / via Skype] so that we can get to know you better';",ddd);
				Thread.sleep(5000);
				
				
				
				//send mail
				WebElement obj2 = driver.findElement(By.name("compose"));
				obj2.click();
				
				//System.out.println("EMAIL SENT");
		
		
		

	}}
