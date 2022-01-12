package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SalaryComponents extends CommonUI {
	@FindBy(xpath = "//li[text() = 'Salary Components']")
	WebElement salaryComponentsTitle;
	
	@FindBy(xpath = "//th[text()='Component Name ']")
	WebElement sortByComponentName;
	
	@FindBy(xpath = "//th[text()='Type ']")
	WebElement sortByType;
	
	@FindBy(xpath = "//th[text()='Part of Total Payable? ']")
	WebElement sortByPartOfTotalPayable;
	
	@FindBy(xpath = "//th[text()='Cost to Company? ']")
	WebElement sortByCostToCompany;
	
	@FindBy(xpath = "//i[text() = 'ohrm_edit']")
	WebElement editOption;
	
	@FindBy(xpath = "//i[text() ='add']")
	WebElement addButton;
	
	@FindBy(id = "stickyHelpButton")
	WebElement helpButton;
	
	@FindBy(xpath = "//h4[text()= 'Add Salary Component']")
	WebElement addSalaryTitle;
	
	@FindBy(id ="name")
	WebElement componentName;
	
	@FindBy(id = "type_1")
	WebElement earningRadio;
	
	@FindBy(id = "type_2")
	WebElement deductionRadio;
	
	@FindBy(id = "is_part_of_total_payable")
	WebElement totalPayableRadio;
	
	@FindBy(id = "is_cost_to_company")
	WebElement costToCompanyRadio;
	
	@FindBy(id = "amount")
	WebElement amountRadio;
	
	@FindBy(id = "percentage")
	WebElement percentageRadio;
	
	@FindBy(css = "div[class = 'helpvalue schema-form-helpvalue ']")
	WebElement requiredFieldLabel;
	
	@FindBy(css = ".modal-action.modal-close.waves-effect.waves-green.btn")
	WebElement cancelButton;
	
	@FindBy(css = ".modal-action.waves-effect.waves-green.btn.primary-btn")
	WebElement saveButton;
	
	public SalaryComponents() {
		PageFactory.initElements(driver, this);
	}
	
	public String salaryComponentsTitle() {
		return getText(salaryComponentsTitle);
	}
	public void clickSortByComponentName() {
		click(sortByComponentName);
	}
	public void clickSortByType() {
		click(sortByType);
	}
	
	public void clickSortByPartOfTotalPayable() {
		click(sortByPartOfTotalPayable);
	}
	public void clickSortByCostToCompany() {
		click(sortByCostToCompany);
	}
	public void clickEditOption() {
		click(editOption);
	}
	
	public void clickAddButton() {
		click(addButton);
	}
	public void clickHelpButton() {
		click(helpButton);
	}
	public String AddSalaryTitle() {
		return getText(addSalaryTitle);
	}
	public void enterComponentName(String txt) {
		enter(componentName, txt);
	}
	public void clickEarningRadio() {
		click(earningRadio);
	}
	public void clickDeductionRadio() {
		click(deductionRadio);
	}
	public void clickTotalPayableRadio() {
		click(totalPayableRadio);
	}
	public void clickCostToCompanyRadio() {
		click(costToCompanyRadio);
	}
	public void clickAmountRadio() {
		click(amountRadio);
	}
	public void clickPercentageRadio() {
		click(percentageRadio);
	}
	public String requiredFieldLabel() {
		return getText(requiredFieldLabel);
	}
	public void clickCancelButton() {
		click(cancelButton);
	}
	public void clickSaveButton() {
		click(saveButton);
	}
}
