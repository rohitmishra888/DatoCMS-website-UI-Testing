package com.capstone.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.signuppage.SignUppage;

public class Loginpage extends BrowserFactory {
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement Logo;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Reset password')]")
	WebElement resetPasswordlink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signuplink;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div/div[1]/span")
	WebElement errormsg;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clicklogo() {
		Logo.click();
	}
	
	public void clickloginbutton() {
		loginButton.click();
	}
	
	public void enteremail(String email) {
		this.email.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickResetPassword() {
		resetPasswordlink.click();
	}
	
	public String getmsg() {
		return errormsg.getText();
	}
	
	public SignUppage clickSignuplink() {
		signuplink.click();
		return new SignUppage();
	}
	
	public void close() {
		driver.close();
	}
}
