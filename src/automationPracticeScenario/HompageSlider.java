package automationPracticeScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//***************add to cart 
public class HompageSlider {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://practice.automationtesting.in/test-cases/");
		System.out.println("open the url");
		
		WebElement shop=driver.findElement(By.xpath("//li[@id='menu-item-40']"));
		shop.click();
		
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
WebElement bookclick=driver.findElement(By.xpath("//h3[text()='Selenium Ruby']"));
bookclick.click();

WebElement addtocart=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
addtocart.click();

WebElement discription=driver.findElement(By.xpath("//li[@class='description_tab active']"));
discription.click();
Thread.sleep(3000);

WebElement riveiw=driver.findElement(By.xpath("//li[@class='reviews_tab']"));
riveiw.click();




	}

}
