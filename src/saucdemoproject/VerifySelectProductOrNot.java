package saucdemoproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.firefox.FirefoxDriver;
//verify able to select the item or not
public class VerifySelectProductOrNot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
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
	System.out.println("produt is selected");
	WebElement selectItem=driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
	selectItem.click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File seleFile=ts.getScreenshotAs(OutputType.FILE);
File myfile=new File("D:\\webdriver\\screenshot\\saucSelectItem.jpg");
FileHandler.copy(seleFile, myfile);
String actualresult=driver.getTitle();
System.out.println(actualresult);
String expectedResult="Swag Labs";
if(actualresult.equals(expectedResult))
{
	System.out.println("testcse is pass");
}
else
	System.out.println("testcase is failed");
	}

}
