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

	@FindBy(xpath = "//*[text() = 'Login']")
	WebElement loginButton;
	
	

public LoginPage() {
	
	PageFactory.initElements(driver, this);
}

public void enterUsername(String userName) {
	enter(userNameField, userName);
	
}

public void enterPassword(String password) {
	enter(passwordField, password);
	
}

public void clickLogin() {
	click(loginButton);
}

}



 