package org.login;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.api.internal.OtelEncodingUtils;

public class Launch6 {

	public static void main (String [] args) throws InterruptedException, AWTException, IOException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.click();
		
		Thread.sleep(2000);
		WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("oneplus nord ce 2 5g ");
		
		Thread.sleep(2000);
		WebElement search1 = driver.findElement(By.id("gh-btn"));
		search1.click();
		
		Thread.sleep(2000);
		WebElement popup = driver.findElement(By.xpath("//button[@class='srp-save-search__tooltip-close']"));
		popup.click();
		
		Thread.sleep(2000);
		WebElement oneplus = driver.findElement(By.xpath("//h3[text()='OnePlus Nord CE 2 5G RAM 8GB+128GB Smartphone']"));
		oneplus.click();
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String a : windowHandles) {
			if (!windowHandle.equals(a)) {
				
				driver.switchTo().window(a);
				
				Thread.sleep(3000);
				WebElement placeorder = driver.findElement(By.xpath("//a[@data-cta='placebid']"));
				placeorder.click();	
				
				Thread.sleep(3000);
				WebElement username = driver.findElement(By.xpath("//label[text()='Email or username']"));
				username.sendKeys("sudhirkumar");
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}    
       
}