package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch3 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("sudhir");
		
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("kumar");
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("Username"));
		username.sendKeys("sk7997559");
		
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("Sudhir1234");
		
		Thread.sleep(1000);
        WebElement confirmpassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmpassword.sendKeys("Sudhir1234");
        
        Thread.sleep(1000);
        WebElement nextbutton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextbutton.click();
        
        Thread.sleep(2000);
        WebElement verification = driver.findElement(By.xpath("//label[@jsaction='click:cOuCgd; keydown:I481le;']"));
        verification.sendKeys("9840123123");
        
        WebElement selectbutton = driver.findElement(By.xpath("//span[text()='Next']"));
        selectbutton.click();
                 
        
        
	}

				
				
	}
