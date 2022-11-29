package automationPracticeScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://www.makemytrip.com/");
		System.out.println("open the url");
		//input[@class='react-autosuggest__input react-autosuggest__input--open']
		WebElement from=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("Mumbai, India");
		List<WebElement>auto=driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println(auto.size());
		for(WebElement listItem:auto)
		{
			if(listItem.getText().contains("Mumbai, India"))
			{
				listItem.click();
				break;
			}
		}
		//(//input[@type='text'])[2]
				WebElement to=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				to.sendKeys("Bangkok, Thailand");
				List<WebElement>auto1=driver.findElements(By.xpath("//li[@role='option']"));
				System.out.println(auto1.size());
				
				for(WebElement listItem1:auto1)
				{
					if(listItem1.getText().equals("Bangkok, Thailand"))
					{
						listItem1.click();
						break;
						
					}
				}
				

		
	}

}
