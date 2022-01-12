package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class JobTitles extends CommonUI{

	@FindBy(css = "i[class = 'material-icons icons-color']")
	WebElement threeDots;
	
	@FindBy(css = "i[class = 'material-icons list-sorting-icons tiny']")
	WebElement sortOption;
	
	@FindBy(css = "i[class='large material-icons']" )
	WebElement addButton;
	
	@FindBy(id = "stickyHelpButton")
	WebElement helpButton;
	
	@FindBy(xpath = "//i[text() = 'ohrm_edit']")
	WebElement editOption;
	
	@FindBy(xpath = "//a[text()='Select All']")
	WebElement selectAllOption;
	
	@FindBy(xpath = "//h5[text()='Add Job Title']")
	WebElement addJobTitleHeader;
	
	@FindBy(id = "jobTitleName")
	WebElement jobTitle;
	
	@FindBy(id = "jobDescription")
	WebElement jobDescription;
	
	@FindBy(id = "note")
	WebElement note;
	
	@FindBy(id = "modal-save-button")
	WebElement saveButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//a[text()='Deselect All']")
	WebElement deselectAllOption;
	
	@FindBy(xpath = "//a[text()='Delete Selected']")
	WebElement deleteAllOption;
	
	public JobTitles() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickThreeDots() {
		click(threeDots);
	}
	
	public void clickSortOption() {
		click(sortOption);
	}
	
	public void clickAddButton() {
		click(addButton);
	}
	
	public void clickEditOption() {
		click(editOption);
	}
	
	public void clickSelectAllOption() {
		click(selectAllOption);
	}
	
	public String addJobTitleHeader() {
		return getText(addJobTitleHeader);
	}
	
	public void enterJobTitle(String txt) {
		enter(jobTitle,txt);
	}
	
	public void enterJobDescription(String txt) {
		enter(jobDescription, txt);
	}
	
	public void enterNote(String txt) {
		enter(note, txt);
	}
	
	public void clickSaveButton() {
		click(saveButton);
	}
	
	public void clickCancelButton() {
		click(cancelButton);
	}
	
	public void clickDeselectAllOption() {
		click(deselectAllOption);
	}
	
	public void clickDeleteAllOption() {
		click(deleteAllOption);
	}
}


/**
	Refer to Document  on which element to inspect



*/