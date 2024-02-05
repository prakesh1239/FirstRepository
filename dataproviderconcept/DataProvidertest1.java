package dataproviderconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidertest1 {
	

	@Test(dataProvider = "testdata")
	public void logintest(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@onkeyup='validateuserid();']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@onkeyup='validatepassword();']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[text() ='Manager']")).isDisplayed());
		
		Thread.sleep(4000);
		driver.quit();

	}

	@DataProvider()
	public Object[][] testdata() {
		Object[][] tdata = new Object[2][2];
		tdata[0][0] = "mngr266311";
		tdata[0][1] = "Admin123$";
		tdata[1][0] = "mngr266311";
		tdata[1][1] = "Admin123";
		
		return tdata;

	}
}
