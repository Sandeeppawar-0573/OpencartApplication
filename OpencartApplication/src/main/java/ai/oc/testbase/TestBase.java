package ai.oc.testbase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.oc.pagelayer.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static  WebDriver driver;
	public HomePage hp;
	public JavascriptExecutor j;
	
	@ BeforeMethod
	public void start() {
		String BrowserName="chrome";
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		
		else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new 	FirefoxDriver();
		}
		
		else
		{
			System.out.println("Provide valid browser");
		}
		
		
		//open  the browser 
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// object creation
		hp= new HomePage();
		 
	}

}
