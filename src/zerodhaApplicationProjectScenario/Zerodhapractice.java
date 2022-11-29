package zerodhaApplicationProjectScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodhapractice {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//input[@id='userid']
		WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("GQJ330");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("mahesh@1124");
		
		//button[@class='button-orange wide']
		WebElement login=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		login.click();
		
		
		WebElement pin=driver.findElement(By.xpath("//input[@placeholder='••••••']"));
		pin.sendKeys("100001");
		
		
		WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		
		
		WebElement goldblees=driver.findElement(By.xpath("(//span[@class='symbol'])[1]"));
		goldblees.click();
		WebElement sell=driver.findElement(By.xpath("(//a[@href='#'])[4]"));
		sell.click();
		
//		WebElement marketdept=driver.findElement(By.xpath("(//a[@href='#'])[3]"));
//		marketdept.click();
//driver.close();
	
	}
}
