package com.selenium.partone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInSelenium {

	public static void main(String[] args) {
		// Type of element
		// 1.1 ID
		//2. x-path 
		// Absolute x-path
		// relative x- path
		//3.CSS selector
		// how to get a developer code
		// go to right side with ... vertical  and click on more tool and select a developer tool
        // how to create a path generate unique key
		//  //a@class=' class name' the class name has to be the one you can not get it again
		// easy key to find x path
		// use the x path from the option selector
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meheret\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       String baseUrl = "Http://pnc.com" ;
	       driver.get(baseUrl);
	       driver.findElement(By.name("userId")).sendKeys("mimi");
	       driver.manage().window().maximize();
	       try {
	    	  Thread.sleep(4000);
	    	   
	       }catch (InterruptedException e){
	    	   System.out.println("Got and error");
	       }
	       driver.close();
	       
	}

}
