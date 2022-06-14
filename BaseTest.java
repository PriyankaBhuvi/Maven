package genric;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo{
	
   private WebDriver driver;
	private String strBaseUrl;
	
    public void initilizeWebDriver () {
    	
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver.exe");
  	driver = new ChromeDriver();
  	strBaseUrl=("https://ebs4-qa2.simplifyhealthcare.com/");
  	this.setStrBaseUrl(strBaseUrl);
 	driver.get(this.getStrBaseUrl());
 	this.setDriver(driver);
	driver.manage().window().maximize();
	
}
     public void tearDown() {
   	  driver.quit();
     }
}



