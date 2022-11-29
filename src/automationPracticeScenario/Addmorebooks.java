package automationPracticeScenario;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//****************add more than stock of book -warning message show 
public class Addmorebooks {
	public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("open the browser");
	driver.manage().window().maximize();//maximize the window
	
	driver.get("https://practice.automationtesting.in/test-cases/");
	System.out.println("open the url");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement shop=driver.findElement(By.xpath("//li[@id='menu-item-40']"));
	shop.click();
	
	WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	home.click();
WebElement bookclick=driver.findElement(By.xpath("//h3[text()='Selenium Ruby']"));
bookclick.click();
WebElement addmultiplebook=driver.findElement(By.xpath("//input[@name='quantity']"));
addmultiplebook.sendKeys("9900");
WebElement addtocart=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
addtocart.click();

TakesScreenshot ts=(TakesScreenshot)driver;
File selefile=ts.getScreenshotAs(OutputType.FILE);
File myfile=new File("D:\\webdriver\\screenshot\\practice.jpg");
FileHandler.copy(selefile, myfile);


	}

}
