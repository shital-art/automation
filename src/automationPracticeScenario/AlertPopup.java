package automationPracticeScenario;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			System.out.println("open the browser");
			driver.manage().window().maximize();//maximize the window
			
			driver.get("https://practice.automationtesting.in/test-cases/");
			System.out.println("open the url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement demosite=driver.findElement(By.xpath("//a[text()='Demo Site']"));
			demosite.click();
			WebElement switchto=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
			Actions a=new Actions(driver);
			a.moveToElement(switchto).perform();
			WebElement alert=driver.findElement(By.xpath("//a[text()='Alerts']"));
			alert.click();
			
			
			WebElement alertwithok=driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
			alertwithok.click();
			
			WebElement clickondisplayalert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			clickondisplayalert.click();
			Alert alt=driver.switchTo().alert();
			alt.accept();
			
					WebElement clickondisplayalert2=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
					clickondisplayalert2.click();
					
					WebElement alertbox=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
					alertbox.click();
					alt.dismiss();
					
					WebElement alertwithtextbox=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
					alertwithtextbox.click();
					
					WebElement alertwithtextbox1=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
					alertwithtextbox1.click();
					alt.sendKeys("hello");
					alt.accept();
					
					//alt.dismiss();
					
					
	}

}
