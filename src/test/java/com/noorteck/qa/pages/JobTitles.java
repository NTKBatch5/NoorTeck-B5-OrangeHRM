package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class JobTitles extends CommonUI {

	@FindBy(xpath = "//a[contains(@class, 'dropdown-button dropdown')]")
	WebElement dropField;

	@FindBy(xpath = "//th[contains(text(), 'Job Title')]")
	WebElement jobField;

	@FindBy(xpath = "//span[contains(text(), 'Help')]")
	WebElement helpButton;

	@FindBy(xpath = "//div[contains(@data-tooltip, 'Add Job Title')]")
	WebElement addJobButton;

	@FindBy(xpath = "//td[contains(@data-tooltip-id, 'c7bac6cb-d6ed-825c-9ad4-468fe0f58564')]")
	WebElement editField;

	@FindBy(xpath = "//a[contains(text(), 'Select All')]")
	WebElement selectButton;

	@FindBy(xpath = "//h5[contains(text(), 'Add Job Title')]")
	WebElement addJobField;

	@FindBy(css = "#jobTitleName")
	WebElement jobTitleField;

	@FindBy(css = "#jobDescription")
	WebElement jobDescriptionField;

	@FindBy(css = "#note")
	WebElement noteField;

	@FindBy(xpath = "//button[contains(text(), 'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//a[contains(text(), 'Deselect All')]")
	WebElement deselectAllButton;

	@FindBy(xpath = "//a[contains(text(), 'Delete Selected')]")
	WebElement deleteSelectedButton;

	public JobTitles() {
		PageFactory.initElements(driver, this);

	}

	public void clickDropDownButton() {
		click(dropField);
	}

	public void clickJobTitle() {
		click(jobField);
	}

	public void clickHelpButton() {
		click(helpButton);
	}

	public void clickAddJobTitle() {
		click(addJobButton);
	}

	public void clickEdit() {
		click(editField);
	}

	public void clickSelectAllButton() {
		click(selectButton);
	}

	public static String getTitle() {
		return getTitle();
	}

	public void enterJobTitleField(String jobTitle) {
		enter(jobTitleField, jobTitle);
	}

	public void enterJobDescription(String jobDescription) {
		enter(jobDescriptionField, jobDescription);
	}

	public void enterNoteField(String note) {
		enter(noteField, note);
	}

	public void clickCancel() {
		click(cancelButton);
	}

	public void clickSave() {
		click(saveButton);
	}

	public void clickDeselectAll() {
		click(deselectAllButton);
	}

	public void clickDeleteSelected() {
		click(deleteSelectedButton);
	}
}
