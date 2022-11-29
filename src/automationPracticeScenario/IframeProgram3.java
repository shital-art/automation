package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeProgram3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement iframebutton =driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframebutton.click();
		WebElement outeriframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outeriframe);

		WebElement inneriframe1=driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
	driver.switchTo().frame(inneriframe1);

		WebElement textbox =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("shital");
		
		
		
//		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(iframe1);

	}
}
