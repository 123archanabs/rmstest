package com.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pompage {
	
	@FindBy (xpath="//input[@type='email']")
	public WebElement  email;
	
	@FindBy (id="signPwd")
	public WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement submit;


	@FindBy (xpath="//*[@id='root']/div[2]/div[2]/form/p")
	public static WebElement Resetpass;
	
	@FindBy (id="sendMail")
	public static WebElement submitemail;



public pompage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}



	public WebElement getEmail() {
	return email;
}



public void setEmail(WebElement email) {
	this.email = email;
}



public WebElement getPassword() {
	return password;
}



public void setPassword(WebElement password) {
	this.password = password;
}



public WebElement getSubmit() {
	return submit;
}



public void setSubmit(WebElement submit) {
	this.submit = submit;
}



public static WebElement getResetpass() {
		return Resetpass;
	}



	public static void setResetpass(WebElement resetpass) {
		Resetpass = resetpass;
	}



	public static WebElement getSubmitemail() {
		return submitemail;
	}



	public static void setSubmitemail(WebElement submitemail) {
		pompage.submitemail = submitemail;
	}

	

}
