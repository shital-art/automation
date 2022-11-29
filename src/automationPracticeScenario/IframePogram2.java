package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframePogram2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		WebElement topic=driver.findElement(By.xpath("//b[@id='topic']"));
		topic.sendKeys("java");
		
		
		WebElement iframe3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(iframe3);
		
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();
		
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(iframe);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		Select s=new Select(dropdown);
		s.selectByVisibleText("Baby Cat");
		
	}	

}
