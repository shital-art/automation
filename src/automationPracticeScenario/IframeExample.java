package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement selenium=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
//		selenium.click();
//		String pageadd=driver.getWindowHandle();
//		System.out.println(pageadd);
//		List <String>allpagaddress=new ArrayList <String>(driver.getWindowHandles());
//		//System.out.println(allpagaddress);
//		driver.switchTo().window(allpagaddress.get(1));
////	WebElement practice=driver.findElement(By.xpath("//input[@id='name']"));
//	practice.sendKeys("Velocity o4th JuneBatch");
//	
WebElement iframeselenium=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
driver.switchTo().frame(iframeselenium);
WebElement menu=driver.findElement(By.xpath("//span[@class='mobile_menu_bar mobile_menu_bar_toggle']"));
menu.click();


	WebElement studentriview=driver.findElement(By.xpath("(//a[text()='Student Review'])[2]"));
	studentriview.click();
	
	
	
	}
	

}
