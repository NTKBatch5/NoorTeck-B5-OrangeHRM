package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class MenuPage extends CommonUI {
	
	@FindBy (id="menu_admin_viewAdminModule")
	WebElement adminMenu;
	
	
	@FindBy (id= "menu_admin_Job")
	WebElement jobMenu;
	
	@FindBy (id="menu_admin_viewJobTitleList")
	WebElement jobTitleMenu;
	
	@FindBy (id="menu_admin_viewSalaryComponentList")
	WebElement salaryComponentMenu;
	
	@FindBy (id="menu_admin_employmentStatus")
	WebElement employmentStatusMenu;
	
	@FindBy (id="menu_admin_jobCategory")
	WebElement jobCategoryMenu;
	
	@FindBy (id="menu_admin_workShift")
	WebElement workShiftMenu;
	
	@FindBy (id="menu_admin_Qualifications")
	WebElement qualificationsMenu;

	@FindBy (id="menu_admin_viewSkills")
	WebElement skillsMenu;
	
	@FindBy (id="menu_admin_viewEducation")
	WebElement educationMenu;
	
	@FindBy (id="menu_pim_viewPimModule")
	WebElement pIMMenu;
	
	@FindBy (id="menu_pim_viewEmployeeList")
	WebElement employeeList;
	
	@FindBy (id="menu_discipline_defaultDisciplinaryView")
	WebElement disciplinaryMenu;
	
	@FindBy (id="menu_onlinetraining_OTM")
	WebElement oTMenu;
	
	@FindBy (id="menu_onlinetraining_viewOnlineCourseEmployee")
	WebElement myCOursesMenu;
	
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdminMenu() {
		click(adminMenu);
	}
	
	public void clickJobMenu() {
		click(jobMenu);
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