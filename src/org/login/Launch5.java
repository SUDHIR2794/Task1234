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

public class Launch5 {

	public static void main (String [] args) throws InterruptedException, AWTException, IOException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		popup.click();
		
		Thread.sleep(4000);
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobiles.click();
		
		Thread.sleep(4000);
		WebElement electronics = driver.findElement(By.xpath("//span[@class='_2I9KP_']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		
		Thread.sleep(2000);
		WebElement mi = driver.findElement(By.xpath("//a[@class='_3QN6WI']"));
		act.click(mi).perform();
		
		Thread.sleep(2000);
		WebElement clickbutton = driver.findElement(By.xpath("//div[text()='REDMI 10A (Slate Grey, 32 GB)']"));
		clickbutton.click();
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String a : windowHandles) {
			if (!windowHandle.equals(a)) {
				
				driver.switchTo().window(a);
				
				Thread.sleep(2000);
				WebElement gb = driver.findElement(By.xpath("//a[text()='64 GB']"));
				gb.click();
			
				Thread.sleep(3000);
				WebElement buy = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
				buy.click();
				
				Thread.sleep(3000);
				WebElement mobilenum = driver.findElement(By.xpath("//input[@maxlength='auto']"));
				mobilenum.sendKeys("sudhir2794@gmail.com");
				
				
				Thread.sleep(2000);
				WebElement continuebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']"));
				continuebutton.click();
				
				Thread.sleep(2000);
				WebElement mobile = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
				mobile.sendKeys("9840131131");
				
				Thread.sleep(2000);
				WebElement continuebutton1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']"));
				continuebutton1.click();
				
				
				Thread.sleep(3000);
				WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				password.sendKeys("sudhir1234");
				
				
				Thread.sleep(2000);
				WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
				login.click();
				
				
				
				
			}
			
		}
			
		



		
		
		
		

		
	}    
       
}