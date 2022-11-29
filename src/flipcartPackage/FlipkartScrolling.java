package flipcartPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class FlipkartScrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.flipkart.com");
		System.out.println("open the url");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("9172384730");

	WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("mahesh@11");

		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();


		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-10000)");

		
		

}
}