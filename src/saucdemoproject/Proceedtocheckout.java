package saucdemoproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proceedtocheckout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
		//find username using id locator
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		//find elenment using id locator
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");

	WebElement login =driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
		
		WebElement selectItem=driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
		selectItem.click();
		WebElement addtocart=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
		addtocart.click();
		
		WebElement backtoproduct=driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backtoproduct.click();
		
		
		WebElement selectItem1=driver.findElement(By.xpath("//img[@alt='Sauce Labs Bike Light']"));
		selectItem1.click();

		WebElement addtocart1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		addtocart1.click();
		WebElement shopcartlink=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shopcartlink.click();
		
		
		WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		
	}
}
