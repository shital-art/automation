package facebookWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacbookDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		//Thread.sleep(3000);

		WebElement dayDropDown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		dayDropDown.click();

		Select s=new Select(dayDropDown);
		
		s.selectByVisibleText("24");
		//Thread.sleep(3000);
		
		WebElement monthDropDown=driver.findElement(By.xpath("//select[@id='month']"));
		monthDropDown.click();

		Select s1=new Select(monthDropDown);
		
		s1.selectByVisibleText("May");
		//Thread.sleep(3000);

		WebElement yearDropDown=driver.findElement(By.xpath("//select[@id='year']"));
		monthDropDown.click();

		Select s2=new Select(yearDropDown);
		
		s2.selectByVisibleText("2021");
		//Thread.sleep(3000);


//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//		 username.sendKeys("shitaldalavi7713@gmail.com");
//		 WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
//		 pass.sendKeys("mahesh@11");
//		
//		 
//		 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
//		 login.click();
////		 WebElement searchfacebook=driver.findElement(By.xpath("(//label[@class='icdlwmnq o9w3sbdw f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l alzwoclg nd5c72wq om3e55n1 mfclru0v c8dj4xom kgnml90y'])[1]"));;
//		 searchfacebook.click();
//
//		 WebElement myfreind=driver.findElement(By.xpath("(//span[@class='s19c0p35 febi1ev9 pccvoycu i85zmo3j alzwoclg qm54mken l10tt5db e4ay1f3w'])[1]"));
//		 myfreind.sendKeys("Chhaya Sharad Pawar");

	
		}
}