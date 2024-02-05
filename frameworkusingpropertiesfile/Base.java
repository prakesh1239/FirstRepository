package frameworkusingpropertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public FileInputStream fis;
	public Properties configprop;
	
	@BeforeMethod
	public void setup() throws IOException {
		fis=new FileInputStream("src\\test\\java\\frameworkusingpropertiesfile\\framework.properties");
		configprop=new Properties();
		configprop.load(fis);
		String  browsername=configprop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get(configprop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
		@AfterMethod
		public void teardown() {
			
			driver.quit();
		}
	

	
		
	}

	
	


