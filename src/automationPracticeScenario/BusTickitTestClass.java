package automationPracticeScenario;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusTickitTestClass {
	  static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
  driver= new ChromeDriver();

		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window

		driver.get("https://www.redbus.in");
		System.out.println("open the url");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		BusTickitPomClass bc=new BusTickitPomClass(driver);
	bc.sendfromlocation();
	bc.sendtolocation();
	bc.sendonwarddate();
	bc.gettext();

	
	}

}
