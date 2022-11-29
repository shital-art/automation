package flipcartPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipcartLoginFunctionality {
static WebDriver driver;
	
	static void screenshotMethod(String screenshotName) throws IOException 
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File seleFile = ts.getScreenshotAs(OutputType.FILE);
		File myFile = new File("D:\\webdriver\\flipcartScreenshot\\" + screenshotName+date+ ".jpg");	
		FileHandler.copy(seleFile, myFile);
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
 driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window

		driver.get("https://www.flipkart.com");
		System.out.println("open the url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		System.out.println("enter username");
	WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("9172384730");
System.out.println("enter password");
	WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("mahesh@11");
System.out.println("click on login button");
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		Thread.sleep(1000);
		screenshotMethod("flipcartloginvalidcredential");
		System.out.println("taking screenshot");
		
		String actualresult=driver.getCurrentUrl();
		System.out.println(actualresult);
		
		String expectedResult ="https://www.flipkart.com/";
		System.out.println("apply validation");
		if(actualresult.equals(expectedResult))
		{
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("testcase is failed");
		}

		
	}

}
