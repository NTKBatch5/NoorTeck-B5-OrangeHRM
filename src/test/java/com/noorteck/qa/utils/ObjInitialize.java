package com.noorteck.qa.utils;

import com.noorteck.qa.pages.JobTitles;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;
import com.noorteck.qa.pages.SalaryComponentsPage;

/**
 * The purpose of this class is to initialize the PAGE CLASS Objects
 * @author NoorTeck
 *
 */
public class ObjInitialize extends Constants {
	
	//initialize class objects 
	public static void initializeClassObj() {
		
		jbObj = new JobTitles();
		menuObj = new MenuPage();
		LoginObj = new LoginPage();
		salCompObj = new SalaryComponentsPage();
		
		

	}

}
