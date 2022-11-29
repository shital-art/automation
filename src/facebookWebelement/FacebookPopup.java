package facebookWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FacebookPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement createnewaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	createnewaccount.click();
	
	WebElement name=driver.findElement(By.xpath("//input[@placeholder='First name']"));
	name.sendKeys("shital");
	
	WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	surname.sendKeys("dalavi");
	WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("shitaldalavi@gmail");
	
	WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	pass.sendKeys("shitl@123");
	
	WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
	boolean result=gender.isSelected();
	System.out.println("is element selected"+result);
	if(result==false)
	{
		gender.click();
		boolean result2=gender.isSelected();
		System.out.println("is element selected after clickeng in it"+result2);

		boolean result3=gender.isSelected();
		System.out.println("is element selected after clickeng in it"+result3);

	}
	else
	{
		System.out.println("	radiobutton is already selected");
	}
	
	WebElement pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	Select s=new Select(pronoun);
	
	//select dropdown
	s.selectByValue("6");
	
}
}