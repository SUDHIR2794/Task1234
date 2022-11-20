package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch4 {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Its We\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
		WebElement moveElement = driver.findElement(By.id("credit2"));

		WebElement pastebank = driver.findElement(By.id("bank"));
		
		WebElement moveElement1 = driver.findElement(By.id("fourth"));
		
		WebElement pastebank1 = driver.findElement(By.id("amt7"));
		
		WebElement credit = driver.findElement(By.id("credit1"));
		
		WebElement debit = driver.findElement(By.id("loan"));
		
		WebElement credit1 = driver.findElement(By.id("fourth"));
		
		WebElement debit1 = driver.findElement(By.id("amt8"));
		
		Actions act = new Actions(driver);

		act.dragAndDrop(moveElement, pastebank).perform();

		act.dragAndDrop(moveElement1, pastebank1).perform();

		act.dragAndDrop(credit, debit).perform();
		
		act.dragAndDrop(credit1, debit1).perform();


		
	}
}