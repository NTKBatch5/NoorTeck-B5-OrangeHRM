package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class MenuPage extends CommonUI {

	
	@FindBy (xpath = "//span[text() = 'Admin']")
	WebElement adminOption;
	
	@FindBy (xpath = "//span[text() = 'Job']")
	WebElement jobOption;
	
	@FindBy(xpath = "//span[text() = 'Salary Components']")
	WebElement salaryComponentsOption;
	
	@FindBy(xpath = "//span[text() = 'Qualifications']")
	WebElement qualificationsOption;
	
	@FindBy(xpath = "//span[text() = 'Skills']")
	WebElement skillsOption;
	
	@FindBy(xpath = "//span[text() = 'Education']")
	WebElement educationOption;
	
	@FindBy(xpath = "//span[text() = 'PIM']")
	WebElement pimOption;
	
	@FindBy(xpath = "//span[text() = 'Employee List']")
	WebElement employeeListOption;
	
	@FindBy(xpath = "//span[text() = 'Discipline']")
	WebElement disciplineOption;
	
	@FindBy(xpath = "//span[text() = 'Disciplinary Cases']")
	WebElement disciplinaryCasesOption;
	
	@FindBy(xpath = "//span[text() = 'OTM']")
	WebElement otmOption;
	
	@FindBy(xpath = "//span[text() = 'My Courses']")
	WebElement myCoursesOption;
	
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickadminOption() {
		moveToElementAndClick(adminOption);
	}
	
	public void clickjobOption() {
		moveToElementAndClick(jobOption);
	}
	
	public void clickSalaryComponentsOption() {
		moveToElementAndClick(salaryComponentsOption);
	}
	
	public void clickQualificationsOption() {
		moveToElementAndClick(qualificationsOption);
	}
	
	public void clickSkillsOption() {
		moveToElementAndClick(skillsOption);
	}
	
	public void clickEducationOption() {
		moveToElementAndClick(educationOption);
	}
	
	public void clickPimOption() {
		moveToElementAndClick(pimOption);
	}	
		public void clickEmployeeListOption() {
			moveToElementAndClick(employeeListOption);
	}
	public void clickDisciplineOption() {
			moveToElementAndClick(disciplineOption);
	}
	public void clickDisciplinaryCasesOption() {
		moveToElementAndClick(disciplinaryCasesOption);
	}
	public void clickOtmOption() {
		moveToElementAndClick(otmOption);
	}
	public void clickMyCoursesOption() {
		moveToElementAndClick(myCoursesOption);
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