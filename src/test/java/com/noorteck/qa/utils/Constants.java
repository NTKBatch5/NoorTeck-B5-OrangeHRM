package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.JobTitles;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;
import com.noorteck.qa.pages.SalaryComponentsPage;



/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public static WebDriver driver;
	
	//declare class objects and common objects
	public static JobTitles jbObj;
	public static MenuPage menuObj;
	public static LoginPage LoginObj;
	public static SalaryComponentsPage salCompObj;


}
 