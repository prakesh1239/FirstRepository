package dataproviderconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DataProviderParallelExecution {
	
	@Test(dataProvider = "logincreditials")
	public void seleniumlogin(String username,String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
				
		String  actualtext=	driver.getTitle();
        Assert.assertEquals(actualtext, "Selenium");

		driver.quit();

	}
	
	@DataProvider(parallel = true)
	public Object[][] logincreditials() {
		Object[][] dataset=new Object[3][2];
		dataset[0][0]="admin123@gmail.com";
		dataset[0][1]="admin123";
		
		dataset[1][0]="admin123@gmail.com";
		dataset[1][1]="admin12";
		
		dataset[2][0]="admin13@gmail.com";
		dataset[2][1]="admin123";
		
		dataset[2][0]="admin13@gmail.com";
		dataset[2][1]="admin23";
		return dataset;
	}

}
