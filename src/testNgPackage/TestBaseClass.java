package testNgPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucdemo.PomClass.SaucloginPomClass;

import ScreenshotPackage.ScreenshotMethod;

public class TestBaseClass {
	public WebDriver driver;
@Parameters("BrowserName")
	@BeforeMethod
	public  void setup(String BrowserName) throws IOException {
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(BrowserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	
	
	}
	else
	{
		System.out.println("throw exception");
	}
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		System.out.println("maximize the window");
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//loginpomclassobject
		SaucloginPomClass pmclass=new SaucloginPomClass(driver);
		System.out.println("username is entered");
		pmclass.sendusername();
		System.out.println("password is enterd");
		pmclass.sendpassword();
		System.out.println("click on login button");
		pmclass.clickonlogin();
		ScreenshotMethod.screenshot(driver);
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser close");
	}

}
