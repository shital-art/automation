package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeElementTestClass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	IframePomClass if1=new IframePomClass(driver);
	if1.iframebuttonclick();
	//if1.getinneriframe1();
	//driver.switchTo().window(inneriframe);
	}
}
