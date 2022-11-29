package automationPracticeScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://practice.automationtesting.in/test-cases/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement demosite=driver.findElement(By.xpath("//a[text()='Demo Site']"));
		demosite.click();
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();


		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("shital");
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		lastname.sendKeys("dalavi");
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("aurangabadmaharastra");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		email.sendKeys("shital@7713gmail.com");
		Thread.sleep(3000);

		WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("9132456567");
		
		WebElement gender=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
		gender.click();
		
		WebElement hobbies=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobbies.click();
		
		WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s=new Select(skill);
		s.selectByVisibleText("Adobe Photoshop");
WebElement country=driver.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
		
		Select s1=new Select(country);
		s.selectByVisibleText("Select Country");
		
		
		
		WebElement selectcountry=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		selectcountry.click();
		//input[@class='select2-search__field']
		
//		WebElement selectcountrytext=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
//		selectcountrytext.sendKeys("Japan");
//		
	}

}
