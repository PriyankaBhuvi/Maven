package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginLogOutFlow;

import genric.BaseTest;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class LoginLogOutTest extends BaseTest{
	
    private	LoginPage objLoginPage;
     private  LoginLogOutFlow objLoginLogOutFlow;
	private HomePage objHomePage;
	
	public void initializeWebPages() {
      objLoginPage = new LoginPage(this);
      objLoginLogOutFlow = new LoginLogOutFlow(this);
      objHomePage = new HomePage(this);
}
    @BeforeClass
    public void initializeWebEnv() {
    	this.initializeWebPages();
    	this.initilizeWebDriver();
    }
    @AfterClass
    public void tearDownEnv() {
    	this.tearDown();
    }
    @Test
    public void Tc_001_verifyPortfolioPageDisplyed() {
    	objLoginLogOutFlow.doLogin();
    	objHomePage.verifyHomeTextIsDisplayedInHomePage();
    	 objHomePage.checkPorttProducts();
		 objHomePage.checkConfigPortfPolio();
		objHomePage.checkPackageBuild();
		 objHomePage.getcheckModule();
		 objHomePage.getNotification();
		 objHomePage.checkProductsBuild();
		 objHomePage.getQuotes(); 
		 objHomePage.checkAlTasks();
		 objHomePage.checkCompletedTasks();
		 objHomePage.checkTasks();
		 objHomePage.checkOpenTasks();
		 objHomePage.checkQuotesForModeLoad();
		 objHomePage.checkSearchButton();
		 
		 
		 
}
    
}







