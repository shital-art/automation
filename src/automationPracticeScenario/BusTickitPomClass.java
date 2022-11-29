package automationPracticeScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTickitPomClass {
	private WebDriver driver;
	private String month="Dec 2022";
	private String day1="10";
	@FindBy(xpath="//input[@id='src']")
	WebElement from;
	
	public void sendfromlocation()
	{
		from.sendKeys("Shivaji Nagar, Pune");
	}
	@FindBy(xpath="//input[@id='dest']")
	WebElement to;
	
	public void sendtolocation()
	{
		to.sendKeys("Shrirampur (Ahmednagar)");
	}
	//input[@id='txtOnwardCalendar']
	@FindBy(xpath="//input[@id='onward_cal']")
	WebElement onwarddate;
	
	public void sendonwarddate()
	{
		onwarddate.click();
	}
	public BusTickitPomClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
		
	}
	@FindBy(xpath="//td[text()='Dec 2022']")
	WebElement text;
	@FindBy(xpath="/html/body/div[4]/table/tbody/tr[1]/td[3]")
	WebElement nextarrow;
	@FindBy(xpath="//td[text()='8']")
	WebElement day;
	public void gettext()
	{
		while(true)
		{
	String a=text.getText();	
	System.out.println(a);
	if(a.equals(month))
	{
		break;
	}
	else
	{
		nextarrow.click();
	}

	day.click();
	
	}
	
	}
}
