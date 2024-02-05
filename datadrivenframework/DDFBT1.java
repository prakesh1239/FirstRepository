package datadrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DDFBT1  {
	WebDriver driver;
	@Test(dataProvider = "getdat",dataProviderClass = ExcelDatadriven1.class)
	
	public void validatelogin(String username, String password ) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text ()='Login to Account']")).click();
       String actualtitle=driver.getTitle();
       Assert.assertEquals(actualtitle, "Selenium");
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	



	}


