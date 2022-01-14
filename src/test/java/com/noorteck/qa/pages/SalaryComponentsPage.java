package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SalaryComponentsPage extends CommonUI {
	
	@FindBy(css = "[.page-title]")
	WebElement salaryComponentsTitle;
	
	@FindBy(xpath = "//span[contains(text(), 'Help')]")
	WebElement helpButton;
	
	@FindBy(xpath = "//div[contains(@data-tooltip, 'Add Salary Component')]")
	WebElement addSalaryButton;
	
	@FindBy(xpath = "//th[contains(text(), 'Component Name')]")
	WebElement componentName;
	
	@FindBy(xpath = "//th[contains(text(), 'Type')]")
	WebElement typeField;
	
	@FindBy(xpath = "//th[contains(text(), 'Part of Total Payable? ')]")
	WebElement partPayableField;
	
	@FindBy(xpath = "//th[contains(text(), 'Cost to Company? ')]")
	WebElement costCompanyField;
	
	@FindBy(xpath = "//td[contains(@data-tooltip, 'Edit')]")
	WebElement editToolTip;
	
	@FindBy(xpath = "//h4[contains(text(), 'Add Salary Component')]")
	WebElement addSalaryCompTitle;
	
	@FindBy(xpath = "//label[contains(text(), 'Component Name')]")
	WebElement compNameField;
	
	@FindBy(xpath = "//label[contains(text(), 'Type')]")
	WebElement typeModalField;
	
	@FindBy(xpath = "//label[contains(text(), 'Earning')]")
	WebElement earningRadioBTN;
	
	@FindBy(xpath = "//label[contains(text(), 'Deduction')]")
	WebElement deductionRadioBTN;
	
	@FindBy(xpath = "//label[contains(text(), 'Add to')]")
	WebElement addToField;
	
	@FindBy(xpath = "//label[contains(text(), 'Total Payable')]")
	WebElement totalPayChckBox;
	
	@FindBy(xpath = "//label[contains(text(), 'Cost to Company')]")
	WebElement costToCompChckBox;
	
	@FindBy(xpath = "//label[contains(text(), 'Value Type')]")
	WebElement valueTypeField;
	
	@FindBy(xpath = "//label[contains(text(), 'Amount')]")
	WebElement amountChckBox;
	
	@FindBy(xpath = "//label[contains(text(), 'Percentage')]")
	WebElement percentChckBox;
	
	@FindBy(xpath = "//div[contains(text(), ' Required field')]")
	WebElement requiredField;
	
	@FindBy(xpath = "//a[contains(@ng-click, 'modal.cancel()')]")
	WebElement cancelBTN;
	
	@FindBy(xpath = "//a[contains(text(), 'Save')]")
	WebElement saveBTN;
	
	
	
	
	public SalaryComponentsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String salaryComponentsTitle() {
		return getText(salaryComponentsTitle);
	}
	
	public void clickHelpButton() {
		click(helpButton);
	}
	
	public void clickAddSalaryButton() {
		click(addSalaryButton);
	}
	
	public void clickComponentNameField() {
		click(componentName);
	}
	
	public void clickTypeField() {
		click(typeField);
	}
	
	public void clickPartPayableField() {
		click(partPayableField);
	}
	
	public void clickCostCompanyField() {
		click(costCompanyField);
	}
	
	public void clickEditToolTip() {
		click(editToolTip);
	}
	
	public String AddSalaryCompTitle() {
		return getText(addSalaryCompTitle);
	}
	
	public void enterCompNameField(String compName) {
		enter(compNameField, compName);
	}
	
	public String typeModalField() {
		return getText(typeModalField);
	}
	
	public void clickEarningRadioBTN() {
		click(earningRadioBTN);
	}
	
	public void clickDeductionRadioBTN() {
		click(deductionRadioBTN);
	}
	
	public String addToField() {
		return getText(addToField);
	}
	
	public void clickTotalPayChckBox() {
		click(totalPayChckBox);
	}
	
	public void clickCostToCompChckBox() {
		click(costToCompChckBox);
	}
	
	public String valueTypeField() {
		return getText(valueTypeField);
	}
	
	public void clickAmountChckBox() {
		click(amountChckBox);
	}
	
	public void clickPercentChckBox() {
		click(percentChckBox);
	}
	
	public String requiredField() {
		return getText(requiredField);
	}
	
	public void clickCancelBTN () {
		click(cancelBTN);
	}
	
	public void clickSaveBTN() {
		click(saveBTN);
	}

	
}
