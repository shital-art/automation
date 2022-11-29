package flipcartPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartAddtocart {
static WebDriver driver;
	
	static void screenshotMethod(String screenshotName) throws IOException 
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File seleFile = ts.getScreenshotAs(OutputType.FILE);
		File myFile = new File("D:\\webdriver\\flipcartScreenshot\\" + screenshotName+date+ ".jpg");	
		FileHandler.copy(seleFile, myFile);
	}

public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.flipkart.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement closebutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();
		
		System.out.println("click on mobiles");
				WebElement mobiles=driver.findElement(By.xpath("(//div[contains(@class,'xtXmb')])[2]"));
				mobiles.click();
				
				WebElement Tvappliences=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));

				Actions act=new Actions(driver);
				act.moveToElement(Tvappliences).perform();
				WebElement invertorAc=driver.findElement(By.xpath("//a[contains(text(),'Inverter AC')]"));
				invertorAc.click();
				
				WebElement selectinvertorAc=driver.findElement(By.xpath("(//div[contains(@class,'CXW8mj')])[1]"));
				selectinvertorAc.click();
				
				List<String>Allpageaddress= new ArrayList <String> (driver.getWindowHandles());
				//System.out.println(Allpageaddress);
				driver.switchTo().window(Allpageaddress.get(1));
				
				WebElement addtocart=driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]"));
				addtocart.click();
				Thread.sleep(1000);
				screenshotMethod("addtocartproduct");
				 
				
				
}
}
