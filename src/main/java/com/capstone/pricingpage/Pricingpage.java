package com.capstone.pricingpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capstone.browserfactory.BrowserFactory;

public class Pricingpage extends BrowserFactory {
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement logo;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[4]/div[1]/div[1]/div[1]/a[1]")
	WebElement agency_partner_program_link;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[5]/div[1]/div[1]")
	WebElement compare_Limits_and_feature_button;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[8]/div[1]/div[2]/div[1]/picture[1]/img[1]")
	WebElement image;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[8]/div[1]/div[2]/div[1]/picture[1]/img[1]")
	WebElement privacy_policy_link;
	
	public Pricingpage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void click_Logo() {
		logo.click();
	}
	
	public void click_agency_partner_program_link() {
		agency_partner_program_link.click();
	}
	
	public void click_compare_limits_and_feature_Button() {
		compare_Limits_and_feature_button.click();
	}
	
	public Boolean verify_image() {
		return image.isDisplayed();
	}
	
	public void click_privacy_policy_link() {
		privacy_policy_link.click();
	}
	
	public void scrolltoimage() {
		Scrolltoelement(image);
	}
	
	public void scroll_to_privacy_policy() {
		Scrolltoelement(privacy_policy_link);
	}
	
	public void Scrolltoelement(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void close() {
		driver.close();
	}

}
