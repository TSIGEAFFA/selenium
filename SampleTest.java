package com.selenium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SampleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meheret\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       String baseURL = "Http://cnn.com";
       driver.get(baseURL);
       driver.manage().window().maximize();
       //try {
    	//   Thread.sleep(4000);
    	   
      // }catch (IntrruptedException e){
    	   System.out.println("Got and error");
      // }
       driver.close();
	}

}
