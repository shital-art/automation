package automationPracticeScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePomClass {
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='analystic'])[2]")
	WebElement iframebutton;
	
	public void iframebuttonclick()
	{
		iframebutton.click();
	}
	
	@FindBy(xpath="//iframe[@src='MultipleFrames.html']")
	WebElement inneriframe;
	
//	public WebElement getinneriframe1()
//	{
//		WebElement inneriframe ;
//	//	return ;
//	}
//	
	public IframePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	

}
