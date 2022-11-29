package automationPracticeScenario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open the browser");
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://vctcpune.com/");
		System.out.println("open the url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selenium=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		selenium.click();
		String pageadd=driver.getWindowHandle();
		System.out.println(pageadd);
		List <String>allpagaddress=new ArrayList <String>(driver.getWindowHandles());
		//System.out.println(allpagaddress);
		driver.switchTo().window(allpagaddress.get(1));
	WebElement practice=driver.findElement(By.xpath("//input[@id='name']"));
	practice.sendKeys("Velocity o4th JuneBatch");
	
	List<WebElement> theaders=driver.findElements(By.xpath("//table//tbody//tr//th"));
	System.out.println("theaders size is" +theaders.size());
	
	for(int i=0;i<theaders.size();i++)
	{
		WebElement cell=theaders.get(i);
		String celldata=cell.getText();
		System.out.println(celldata);
	}
	List<WebElement> webtabledata=driver.findElements(By.xpath("//table//tbody//tr//td"));
	System.out.println("webtablecell size is" +webtabledata.size());
	
	for(int i=0;i<webtabledata.size();i++)
	{
		WebElement cell=webtabledata.get(i);
		String celldata=cell.getText();
		System.out.println(celldata);
	}
//	for(int i=0;i<1;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				
//				WebElement cell=webtabledata.get(i);
//			String celldata=cell.getText();
//			System.out.print(" ");
//			System.out.print(celldata);
//
//		}
//		System.out.println(" ");
//		}
//	
//			
	}
}
