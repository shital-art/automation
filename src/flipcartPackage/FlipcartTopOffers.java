package flipcartPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartTopOffers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		//1 move to login b and click wishlisht
		WebElement loginb=driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(loginb).perform();
		
//		WebElement wishlist=driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[4]"));
//	wishlist.click();

		//click on topp offers
//		WebElement topoffers=driver.findElement(By.xpath("//div[contains(text(),'Top Offers')]"));
//		topoffers.click();
//become seller
		
//		WebElement becomeseller=driver.findElement(By.xpath("(//span[text()='Become a Seller'])[1]"));
//		becomeseller.click();

		//fashion
	
//			WebElement fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
//			
//			a.moveToElement(fashion).perform();
//			
//			WebElement mensbottomwear=driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[1]"));
//			mensbottomwear.click();
//			
	//	electronics
		WebElement elec=driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		
		a.moveToElement(elec).perform();
		
		WebElement soundbars=driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[7]"));
		soundbars.click();
		
//		WebElement type=driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[1]"));
//		type.click();
//		
//		
//		WebElement studiomonitor=driver.findElement(By.xpath("(//label[@class='_2iDkf8 t0pPfW'])[12]"));
//		studiomonitor.click();
//		
		//handel dropdown
		
	}

}
