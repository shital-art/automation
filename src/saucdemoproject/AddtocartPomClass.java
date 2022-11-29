package saucdemoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocartPomClass {
	WebDriver driver;
	//selectitem
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	WebElement selectitem;

}
