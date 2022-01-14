package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class MenuPage extends CommonUI {
	
	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']/a/span[2]")
	WebElement adminField;
	
	@FindBy(xpath = "//*[@id='menu_admin_Job]/a/span[2]")
	WebElement jobField;
	
	@FindBy(xpath = "//span[contains(text(), 'Salary Components')]")
	WebElement salaryField;
	
	@FindBy(xpath = "//span[contains(text(), 'Qualifications')]")
	WebElement qualField;
	
	@FindBy(xpath = "//span[contains(text(), 'Skills')]")
	WebElement skillsField;
	
	@FindBy(xpath = "//span[contains(text(), 'Education')]")
	WebElement educField;
	
	@FindBy(xpath = "//span[contains(text(), 'PIM')]")
	WebElement pimField;
	
	@FindBy(xpath = "//span[contains(text(), 'Employee List')]")
	WebElement elistField;
	
	@FindBy(xpath = "//span[contains(text(), 'Discipline')]")
	WebElement discipField;
	
	@FindBy(xpath = "//span[contains(text(), 'Disciplinary Cases')]")
	WebElement dcasesField;
	
	@FindBy(xpath = "//span[contains(text(), 'OTM')]")
	WebElement otmField;
	
	@FindBy(xpath = "//span[contains(text(), 'My Courses')]")
	WebElement coursField;
	
	
	public MenuPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdmin() {
		click(adminField);
	}
	
	public void clickJob() {
		click(jobField);
	}
	
	public void clickSalary() {
		click(salaryField);
	}
	
	public void clickQualifications() {
		click(qualField);
	}
	
	public void clickSkills() {
		click(skillsField);
	}
	
	public void clickEducation() {
		click(educField);
	}
	
	public void clickPIM() {
		click(pimField);
	}
	
	public void clickEmployeeList() {
		click(elistField);
	}
	
	public void clickDiscipline() {
		click(discipField);
	}
	
	public void clickDiscilinareCases() {
		click(dcasesField);
	}
	
	public void clickOTM() {
		click(otmField);
	}
	
	public void clickMyCourses() {
		click(coursField);
	}
		

}

/**
Refer to Document  on which element to inspect



*/


/**

	Admin Menu
		Job Menu
			- Job Titles
			- SalaryComponents
			- Pay Grades
			- Employment Status
			- Job Categories
			- Work Shifts
		
		Qualifications Menu
			- Skills
			- Education
	PIM Menu
		- Employee List

	Discipline Menu
		- Disciplinary Cases
		
	OTM Menu
		- My Courses



*/