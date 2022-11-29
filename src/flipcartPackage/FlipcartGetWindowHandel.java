package flipcartPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartGetWindowHandel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.flipkart.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement closebutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();
		
		
				WebElement fashion=driver.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[1]"));
				Actions a=new Actions(driver);
				a.moveToElement(fashion).perform();
				WebElement tshirt=driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
				tshirt.click();
				
				WebElement singletshirt=driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[5]"));
				singletshirt.click();
				
				List<String> alladdress=new ArrayList<String>(driver.getWindowHandles());
				System.out.println(alladdress);
				driver.switchTo().window(alladdress.get(1));
				
				WebElement size=driver.findElement(By.xpath("//li[@id='swatch-0-size']"));
				size.click();
				
				WebElement addtocart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
				addtocart.click();
				
				
				
	}
	

}
