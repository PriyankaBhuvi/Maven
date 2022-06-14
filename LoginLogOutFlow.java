package com.flows;

import genric.Pojo;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class LoginLogOutFlow {
	
	private Pojo objPojo;
	private LoginPage objLoginPage;
    private HomePage objHomePage;
    
    public LoginLogOutFlow(Pojo pojo) {
    	this.objPojo=pojo;
    	objLoginPage = new LoginPage(objPojo);
    }
    
    public void doLogin() {
	objLoginPage.setUserName("v-khushbut");
    objLoginPage.setPassword("Summer@2018#");
     objLoginPage.clickStarted();
    
}
      }