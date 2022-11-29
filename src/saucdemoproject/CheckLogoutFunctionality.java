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

public class CheckLogoutFunctionality {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
		//find username using id locator
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		//find elenment using id locator
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");

	WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	
	WebElement tabbutton=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	tabbutton.click();

	Thread.sleep(5000);

		WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	logout.click();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File seleFile = ts.getScreenshotAs(OutputType.FILE);
	File myFile = new File("D:\\webdriver\\screenshot\\logoutsaucdemo.jpg");	
	FileHandler.copy(seleFile, myFile);

	
String actualResult=driver.getTitle();
System.out.println(actualResult);




}

}
