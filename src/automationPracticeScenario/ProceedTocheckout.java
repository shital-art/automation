package automationPracticeScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//*************Proceed to checkoutbutton************************
public class ProceedTocheckout {
	public static void main(String[] args) throws InterruptedException {
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

WebElement addtocart=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
addtocart.click();

WebElement viewitem=driver.findElement(By.xpath("//a[@title='View your shopping cart']"));
viewitem.click();

///add coupon-krishnasakinala
WebElement couponcode=driver.findElement(By.xpath("//input[@id='coupon_code']"));
couponcode.sendKeys("krishnasakinala");

WebElement addcoupon=driver.findElement(By.xpath("(//input[@class='button'])[1]"));
addcoupon.click();


WebElement proceedtocheckout=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
proceedtocheckout.click();

//a[@class='checkout-button button alt wc-forward']
//a[@title='View your shopping cart']
	}

}
