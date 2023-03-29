package test.com.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Excelfile;
import com.base.basetestclass;
import com.pompage.pompage;


public class testclass extends basetestclass {
	
	pompage pom ;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		
		lauchapp();
		
	}
	
//	@AfterMethod
//	
//	public void tearDown()
//	{
//		
//		driver.quit();
//		
//	}


	@Test
	public void title() throws EncryptedDocumentException, IOException
	
	{
	
		
		Reporter.log("NewWork",true);
		Excelfile f=new Excelfile();
		 String data1 = f.getExcelData("Sheet1", 0, 0);
		 String data2 = f.getExcelData2("Sheet1", 0, 1);
		 
		 

		 pom =new pompage(driver);	
		pom.getEmail().sendKeys(data1);
		pom.getPassword().sendKeys(data2);
	}
	
	@Test
	public void resetpass() throws EncryptedDocumentException, IOException, InterruptedException
	
	{
		
		
		Reporter.log("NewWork",true);
		Excelfile f=new Excelfile();
		 String data1 = f.getExcelData("Sheet1", 0, 0);
		 pom =new pompage(driver);	
		 
		 pom.Resetpass.click();
		 pom.email.sendKeys(data1);
			Thread.sleep(5000);
			pom.submitemail.click();
			String curl= "http://rnd-qa.s3-website.ap-south-1.amazonaws.com/lgin";
			String url=driver.getCurrentUrl();
			Assert.assertEquals(curl, url);
	}
	
	
	
}




