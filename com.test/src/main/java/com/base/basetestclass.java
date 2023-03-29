package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetestclass {
	

	public static Properties p;
    public static WebDriver driver;
    static {
    System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver_win32 (5)\\chromedriver.exe");
    }
    @BeforeTest
    public void config() throws InterruptedException, IOException {
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    try {
         p=new Properties();

    FileInputStream file=new FileInputStream("C:\\selenium\\com.test\\property\\propertiesconfi.properties");

    p.load(file);
    }
    catch(FileNotFoundException e){
        
        e.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
        
    }
    
    
    
    
    }
    
    public static void lauchapp()
    {

    //WebDriverManager.chromedriver().setup();//
    String browser= p.getProperty("browser");
    
    if(browser.contains("chrome"))
    {
         driver= new ChromeDriver();
    }
    else if(browser.contains("FirefoxDriver")) 
    {
         driver= new FirefoxDriver();
    }
    
    
// Actionclass.Implicitwait(driver, 20);
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get(p.getProperty("Url"));
	
	

}
}


