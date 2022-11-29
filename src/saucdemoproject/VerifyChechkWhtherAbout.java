package saucdemoproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyChechkWhtherAbout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
	System.out.println("click on menu button");
	WebElement tabbutton=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	tabbutton.click();

System.out.println("click on about button");
		WebElement about=driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
		about.click();
String actualresult=driver.getTitle();
System.out.println(actualresult);
String Expectedresult="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";

if(actualresult.equals(Expectedresult))
{
	System.out.println("tescase is pass");
}
else
{
	System.out.println("testcase is faileds");
}


}
}