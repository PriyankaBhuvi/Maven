package pageFactory;

import org.openqa.selenium.By;

import genric.Pojo;

public class LoginPage {

	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo=pojo;
	}
	By Loc_inpUsername=By.xpath("//input[@name='UserName']");
	By Loc_inpPassword=By.xpath("//input[@name='Password']");
	By Loc_btnGetStarted=By.xpath("//button[@type='submit']");


	public void setUserName(String strUserName) {
		objPojo.getDriver().findElement(Loc_inpUsername).sendKeys(strUserName);
		
	}
	
	public void setPassword(String strPassword) {
		objPojo.getDriver().findElement(Loc_inpPassword).sendKeys(strPassword);
	
}
	public void clickStarted() {
		objPojo.getDriver().findElement(Loc_btnGetStarted).click();
		
    }
	
}

