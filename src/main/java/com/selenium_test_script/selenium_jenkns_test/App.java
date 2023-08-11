package com.selenium_test_script.selenium_jenkns_test;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
	
	
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        
        
        ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        
        //Initialize web driver with chrome
        WebDriver driver = new ChromeDriver(chromeOptions);
        System.out.println("Scripted Started");
        driver.get("https://www.facebook.com/");
        // wait for application to load
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
        //enter the details in the form
        driver.findElement(By.id("email")).sendKeys("chandu");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("malavade");
        
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);
        

		  //TakesScreenshot scrShot = ((TakesScreenshot)driver);
		  
		 // File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		  
		  //File destFile = new File("screenshot.png");
		  
		 // FileUtils.copyFile(screenShot, destFile);
		 
		//  System.out.println("reports stored at : " + destFile.getAbsolutePath().toString());
      
      Thread.sleep(3000);
  
        
        
        driver.quit();
        
        System.out.println("Script executed successfully");
        
        
    }
}
