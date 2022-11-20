package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch2 {

	public static void main (String [] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement from = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		from.sendKeys("chennai");

		Thread.sleep(1000);
		WebElement to = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		to.sendKeys("madurai");

		Thread.sleep(2000);
		WebElement calander = driver.findElement(By.xpath("//input[@readonly='readonly']"));
		calander.click();
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//td[text()='Aug 2022']"));
		month.click();
		
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.xpath("//td[text()='26']"));
		date.click();
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//button[text()='Search Buses']"));
		search.click();
		
		Thread.sleep(5000);
		WebElement close = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		close.click();
		
		Thread.sleep(2000);
		WebElement seats = driver.findElement(By.xpath("//div[@class='button view-seats fr']"));
		seats.click();

		Thread.sleep(3000);
		WebElement booking = driver.findElement(By.xpath("//li[text()='1499']"));
		booking.click();
		
		Actions act = new Actions(driver);
	
		
	
		WebElement lower = driver.findElement(By.xpath("//canvas[@class='pointer']"));
		act.moveToElement(lower).perform();
		
		
		
	




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}
}