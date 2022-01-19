package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SalaryComponentsPage extends CommonElementPage {

	
	@FindBy(xpath="//span[normalize-space()='Salary Components']")
	WebElement SalaryComponents;
	
	@FindBy(xpath="//*[text()='Help']")
	WebElement Help;
	
	@FindBy(xpath="//th[normalize-space()='Type']")
	WebElement AddSalaryComponent;
	
	@FindBy(xpath="//th[@data-field='name']")
	WebElement ComponentName;
	
	@FindBy(xpath="//th[normalize-space()='Type']")
	WebElement Type;
	
	
	@FindBy(xpath="//th[normalize-space()='Part of Total Payable?']")
	WebElement PartOfTotalPayable;
	
	@FindBy(xpath="//th[normalize-space()='Cost to Company?']")
	WebElement CosttoCompany;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[6]")
	WebElement Edit;
	
	
	
	@FindBy(xpath="//input[@id='name']")
	WebElement ComponentNameField;
	
	@FindBy(xpath="//*[@id= 'type_1']")
	WebElement Earning;
	
	
	@FindBy(xpath="//*[@id= 'type_2']")
	WebElement Deduction;
	
	@FindBy(xpath="//label[normalize-space()='Total Payable']")
	WebElement TotalPayable;
	
	@FindBy(xpath="//label[normalize-space()='Cost to Company']")
	WebElement CosttoCompanyField;
	
	@FindBy(xpath="//*[@for= 'amount']")
	WebElement Amount;
	
	@FindBy(xpath="//*[@for= 'percentage']")
	WebElement Percentage;
	
	@FindBy(xpath="//a[@class='modal-action modal-close waves-effect waves-green btn']")
	WebElement Cancel;
	
	@FindBy(xpath="//a[normalize-space()='Save']")
	WebElement Save;
	
	public SalaryComponentsPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSalaryComponents() {
		click(SalaryComponents);
	}
	public void clickHelp() {
		click(Help);
	}
	
	public void clickAddSalaryComponent() {
		click(AddSalaryComponent);
	}
	public void clickComponent() {
		click(ComponentName);
	}

	public void clickType() {
		click(Type);
	}
	public void clickPartOfTotalPayable() {
		click(PartOfTotalPayable);
	}
	public void clickCosttoCompany() {
		click(CosttoCompany);
	}
	public void clickEdit() {
		click(Edit);
	}
	
	public void enterComponentNameField(String componentnamefield) {
		enter(ComponentNameField,componentnamefield);
	}
	
	public void clickEarning() {
		click(Earning);
	}
	
	public void clickDeduction() {
		click(Deduction);
	}
	public void clickTotalPayable() {
		click(TotalPayable);
	}
	public void clickCosttoCompanyField() {
		click(CosttoCompanyField);
	}
	public void enterAmount(String amount) {
		enter(Amount,amount);
	}
	public void enterPercentage(String percentage) {
		enter(Percentage,percentage);
	}
	public void clickCancel() {
		click(Cancel);
	}
	public void clickSave() {
		click(Save);
	
	
			
	
	
	}
	
	
	
	
	
	
}
