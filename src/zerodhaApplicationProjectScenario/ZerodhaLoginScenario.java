package zerodhaApplicationProjectScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZerodhaLoginScenario {
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
//		WebElement bookmark=driver.findElement(By.xpath("//span[@class='icon icon-bookmark']"));
//		bookmark.click();
//		
		
				
		
//				WebElement goldblees=driver.findElement(By.xpath("(//span[@class='symbol'])[1]"));
//				Actions a=new Actions(driver);
//			a.doubleClick(goldblees).perform();
//		
//				
//				//label[@for='radio-131']
//				WebElement intraday=driver.findElement(By.xpath("//label[@for='radio-131']"));
//				intraday.click();
//						WebElement quantitytextbox=driver.findElement(By.xpath("(//input[@type='number'])[1]"));
//					quantitytextbox.sendKeys("3");
//						
//							WebElement price=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
//						price.sendKeys("42");
//						
//							
//							WebElement market=driver.findElement(By.xpath("//label[@for='radio-138']"));
//							market.click();
//							
//							WebElement stoploss=driver.findElement(By.xpath("//label[@for='radio-140']"));
//							stoploss.click();
//							//button[@type='submit']
//							
//							WebElement buybutton=driver.findElement(By.xpath("//button[@type='submit']"));
//							buybutton.click();
//							
//							
//		
//		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("Tcs");
//		
		//input[@type='text']
//		WebElement goldblees=driver.findElement(By.xpath("(//span[@class='nice-name'])[1]"));
//		goldblees.click();
//		
		//span[@class='icon icon-plus']
		
//		WebElement buyplus=driver.findElement(By.xpath("//span[@class='icon icon-plus']"));
//		buyplus.click();
//		
	
	}
}
