package facebookWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookrequest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		 username.sendKeys("shitaldalavi7713@gmail.com");
		 WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		 pass.sendKeys("mahesh@11");
		
		 
	 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		 login.click();
		 
		 WebElement more=driver.findElement(By.xpath("//a[@aria-label='More']"));
		 more.click();
		 
		 WebElement friends=driver.findElement(By.xpath("(//div[@class='jroqu855 nthtkgg5'])[1]"));
		 friends.click();
		 
	 
	 
	}		 
	

}
