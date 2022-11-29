package facebookWebelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQamouseAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		//perform doubleclick action on webelement using mouse
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions a=new Actions(driver);
	a.doubleClick(doubleclick).perform();
	
	//perform rightclick action on webelement using mouse
	WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	Actions a1=new Actions(driver);
	a1.contextClick(rightclick).perform();
	String expectedmessage="You have done a right click";
	WebElement messagedisplay=driver.findElement(By.xpath("//p[text()='You have done a right click']"));
	String Actualmessage=messagedisplay.getText();
	if(expectedmessage.equals(Actualmessage))
	{
		System.out.println("testcase is pass");
	}
	else
	{
		System.out.println("testcase is failed");
	}
}
}