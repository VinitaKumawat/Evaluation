package com.evaluation2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
		   
	        driver.get("https://www.demoblaze.com/");
	        driver.manage().window().maximize();
	        
        driver.findElement(By.id("signin2")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("akki123");
	        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("password123");
	        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
	        Thread.sleep(2000);
	        
	       driver.switchTo().alert().accept();
	        driver.findElement(By.xpath("//a[@id='login2']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("akki123");
	        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("password123");
	        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	        
	        Thread.sleep(2000);
	        WebElement loginSuccessMessage=driver.findElement(By.id("nameofuser"));
	        System.out.println("login successful:" +loginSuccessMessage.getText());
	        
	        
	        WebElement  itemHeader= driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
	         if(itemHeader.isDisplayed()) {
	        	 System.out.println("Test Passed" );
	         }else {
	        	 System.out.println("Test Failed" );
	         }
	         driver.quit();
	}

}
