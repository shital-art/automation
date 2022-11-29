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
//very login functionality using invalid credential
public class LoginFunctionalityInvalidCredential
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
		System.out.println("enter invalid username");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_users");
		System.out.println("enter invalid password");

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Secret_sauce");

		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	TakesScreenshot ts= (TakesScreenshot)driver;
	File seleFile = ts.getScreenshotAs(OutputType.FILE);
	File myFile = new File("D:\\webdriver\\screenshot\\invalidcredentialsaucdemo.jpg");	
	FileHandler.copy(seleFile, myFile);


	String s=driver.getTitle();
	System.out.println(s);
	//poppu message show -Epic sadface: Username and password do not match any user in this service

	}

}

