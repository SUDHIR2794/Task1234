package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);

		Thread.sleep(3000);
		WebElement customerid = driver.findElement(By.xpath("//input[@type='text']"));
		customerid.sendKeys("SUDHIR1994");
		
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		click.click();
        
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='fldPassword']"));
		password.sendKeys("sudhir1234");
		
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		loginbutton.click();
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
