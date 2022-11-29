package flipcartPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartLogoutFunctionality {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
 WebDriver driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window

		driver.get("https://www.flipkart.com");
		System.out.println("open the url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		System.out.println("enter username");
	WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("9172384730");
System.out.println("enter password");
	WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("mahesh@11");
System.out.println("click on login button");
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
		Thread.sleep(3000);
		WebElement myaccount=driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions a=new Actions(driver);
		a.moveToElement(myaccount).perform();
		
				WebElement logout=driver.findElement(By.xpath("(//a[contains(@class,'_2kxeIr')])[9]"));
				logout.click();
				
				
				String actualresult=driver.getTitle();
				System.out.println(actualresult);
				String Expectedresult="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				if(actualresult.equals(Expectedresult))
				{
					System.out.println("testcase case is pass");
					
				}
				else
				{
					System.out.println("testcase is failed");
				}
				driver.close();
	}
}
