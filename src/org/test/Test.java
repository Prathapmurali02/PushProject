package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("prathap");
		
		driver.findElement(By.id("pass")).sendKeys("prathap2");
		
		driver.findElement(By.name("login")).click();
		
}
}