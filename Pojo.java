package genric;

import org.openqa.selenium.WebDriver;

public class Pojo {
	
	private WebDriver driver;
	private String strBaseUrl;
	private int implicityWait=0;
	
	
	
	 public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getStrBaseUrl() {
		return strBaseUrl;
	}
	public void setStrBaseUrl(String strBaseUrl) {
		this.strBaseUrl = strBaseUrl;
	}
	public int getImplicityWait() {
		return implicityWait;
	}
	public void setImplicityWait(int implicityWait) {
		this.implicityWait = implicityWait;
	}
}