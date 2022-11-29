package flipcartPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandels {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.w3schools.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchresult=driver.findElement(By.xpath("//input[@placeholder='Search our tutorials, e.g. HTML']"));
		searchresult.sendKeys("java");
		WebElement button=driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']"));
		button.click();
		
				WebElement tryyourself=driver.findElement(By.xpath("(//a[@class='w3-btn'])[1]"));
				tryyourself.click();
				
		List<String>allpagesaddress=new ArrayList<String>(driver.getWindowHandles());		
				System.out.println(allpagesaddress);
				driver.switchTo().window(allpagesaddress.get(1));
				Thread.sleep(3000);
		WebElement clickme=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
				clickme.click();
				System.out.println("end of the program");
				
}
}