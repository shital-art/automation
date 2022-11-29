package saucdemoproject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;
//verify the login functionality
public class VerifyLoginFunctinality {
	static WebDriver driver;
	public static void screenshotmethod(String screenshotname) throws IOException
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		

		String date=d1.format(d);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File selefile=ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("D:\\webdriver\\screenshot\\" + screenshotname+date+ ".jpg");
		FileHandler.copy(selefile, myfile);
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	
	System.out.println("open the browser");
	driver.manage().window().maximize();//maximize the window
	System.out.println("maximize the window");
	driver.get("https://www.saucedemo.com/");
	System.out.println("open the url");
	
	System.out.println("taking screenshot");
	screenshotmethod("saucdemologinpage");
//find username using id locator
	System.out.println("enter username");
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
//find elenment using id locator
	System.out.println("enter password");
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("secret_sauce");
System.out.println("click on login button");
WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
login.click();
System.out.println("taking screnshot");
screenshotmethod("saucdemoHomepage");

System.out.println("apply validation");
String actualresult=driver.getTitle();
System.out.println("title of webpage is-" +actualresult);
String expectedResult="Swag Labs";

if(actualresult.equals(expectedResult))
{
	System.out.println("testcase is passed");
}
else
{
	System.out.println("testcase is failed");
}

System.out.println("user should be login successfully");
	
	}
}
