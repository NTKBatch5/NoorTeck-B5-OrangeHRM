package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoginPage extends CommonUI {
	
	@FindBy(id = "txtUsername")
	WebElement userNameField;
	
	@FindBy(id = "txtPassword")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement logInButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickLogInButton() {
		click(logInButton);
	}
	
}



 
/**
	Refer to Document  on which element to inspect



*/


 