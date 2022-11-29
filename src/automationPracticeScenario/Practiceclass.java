package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practiceclass {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.amazon.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement langselect=driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		Actions act=new Actions(driver);
		act.moveToElement(langselect).perform();
		
				WebElement radiobutton=driver.findElement(By.xpath("(//i[@class='icp-radio'])[2]"));
				
				radiobutton.click();
	}



}
