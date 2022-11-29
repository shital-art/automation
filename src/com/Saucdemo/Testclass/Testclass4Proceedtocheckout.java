package com.Saucdemo.Testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Saucdemo.PomClass.SaucHomepagePomClass;
import com.Saucdemo.PomClass.SaucloginPomClass;

import ScreenshotPackage.ScreenshotMethod;
import testNgPackage.TestBaseClass;


public class Testclass4Proceedtocheckout extends TestBaseClass{
	
	@Test
	public void verifyproceedtocheckout() throws IOException
	{
System.out.println("add to cart the product");
		
		SaucHomepagePomClass hp=new SaucHomepagePomClass(driver);
		hp.addtocartProduct();
		System.out.println("click on addto cartlink");
		hp.addtocartlinkClick();
		System.out.println("product is proceed to checkout");
		hp.proceedcheckout();
		ScreenshotMethod.screenshot(driver);
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String expectedPageTitle="Swag Labs";
		if(pageTitle.equals(expectedPageTitle))
		{
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("testcase is failed");
		}
	}
	
}
