package flipcartPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraOnline {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.myntra.com");
		System.out.println("open the url");
		
		WebElement kids=driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(kids).perform();
		
		
		WebElement boy=driver.findElement(By.xpath("(//a[text()='Boys Clothing'])[1]"));
		boy.click();

		//select age
		WebElement tshirt=driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]"));
		tshirt.click();
		
		WebElement age=driver.findElement(By.xpath("(//span[@class='atsa-downArrow sprites-arrowDownBold myntraweb-sprite'])[2]"));
		age.click();
		
//		WebElement selectage=driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[29]"));
//		selectage.click();
//		
		


}
}