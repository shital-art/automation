package verifyloginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe\\");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	Thread.sleep(3000);
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("admin123");
	Thread.sleep(3000);
	WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
//	
}

}
