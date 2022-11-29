package facebookWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdown {
	
//	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//	 WebElement dropdown=driver.findElement(By.xpath("(//span[@class='link_span'])[5]"));
//	 dropdown.click();
//	 WebElement dropdowncountry=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
//	 dropdowncountry.click();
//	
//	Select s=new Select(dropdowncountry);
//	s.selectByValue("AFG");


		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
			System.out.println("browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			System.out.println(" URL is opened");
			Thread.sleep(3000);
			
			WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			dropDown.click();
			
			//we cant select the options in dropdown
			//with the help of webelement/webdriver interface methods
			
			//selenium class
			//in const-always pass a dropdown element
			
			Select s = new Select(dropDown);
			
//			s.selectByIndex(0);
//			s.selectByValue(null);
//			s.selectByVisibleText(null);
			
			s.selectByValue("option2");
			
			
			
			
			
		}

	}
	

