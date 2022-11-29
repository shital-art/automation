package flipcartPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucdemoFindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("open the url");
		//find username using id locator
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		//find elenment using id locator
		WebElement password= driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
login.click();

List <WebElement> addtocart=driver.findElements(By.xpath("//button[text()='Add to cart']"));
//addtocart.click();not possible
for(int i=0;i<addtocart.size();i++)
{
	addtocart.get(i).click();
}
WebElement actualproductSelected=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
String actualproduct=actualproductSelected.getText();
System.out.println(actualproduct);
String expectedproductaddcart="6";

if(expectedproductaddcart.equals(actualproduct))
{
	System.out.println("testcase is pass");
}
else
	System.out.println("testcase is failed");
	}

}
