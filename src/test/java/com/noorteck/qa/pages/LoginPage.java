package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoginPage extends CommonUI{
	
	@FindBy(id = "txtUsername")
	WebElement userNameTextBox;
	
	@FindBy(id = "txtPassword")
	WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUser(String txt) {
		enter(userNameTextBox, txt);
	}
	
	public void enterPassword(String txt) {
		enter(passwordTextBox, txt);
	}
	
	public void clickLogin() {
		click(loginButton);
	}
}



 
/**
	Refer to Document  on which element to inspect



*/


 