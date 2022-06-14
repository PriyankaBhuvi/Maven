package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genric.Pojo;

public class HomePage {

	
private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_txtHome = By.xpath("//div[@class='pull-left hometext']");

	By Loc_getPorttProducts=By.xpath("//div[@class='pull-left cardtitle']");
    By Loc_getConfigPortfPolio=By.xpath("//div[@class='bluetext']");
    By Loc_getProductsBuild=By.xpath("//a[@role='presentation']");
    By Loc_getPackageBuild=By.xpath("//a[@data-toggle='tab']");
    By Loc_checkModule=By.xpath("//div[@class='pull-right mr56 carousalpagination']");
    By Loc_getNotifications=By.xpath("//div[@class='bellnotification centeredmsg']");
    By Loc_getQuotes=By.xpath("//h1[@class='page-title fnt18medium']");
    By Loc_checkSearchButton = By.xpath("//button[@class='btn toggle-btn']");
    By Loc_getDashBoardRepots =By.xpath("//a[@id='executivedashBoard']");
    By Loc_checkSelectForModeLoad = By.xpath("//select[@id='drpViewModeLoad']");
    By Loc_checkTasks = By.xpath("//div[@class='fnt18medium p-0 mt20 mb15 mt15']");
    By Loc_checkOpenTasks = By.xpath("//input[@id='chkOpenTasks']");
    By Loc_checkCompletedTasks = By.xpath("//input[@id='chkCompletedTasks']");
    By Loc_checkAlTasks = By.xpath("//input[@id='chkAllTasks']");
    
	public String getHomeTextOnHomePage() {
	String strHomeText = objPojo.getDriver().findElement(Loc_txtHome).getText();
	return strHomeText;
	}
	
	public void verifyHomeTextIsDisplayedInHomePage() {
		if(this.getHomeTextOnHomePage().equals("Home")) {
		System.out.println("Test passed");
		}
		else {
			System.out.println("Test not passed");
		}
	}

	 public void checkPorttProducts() {
		 objPojo.getDriver().findElement(Loc_getPorttProducts).click();

	}
	    public void checkConfigPortfPolio() {
	    	Actions actions = new Actions(objPojo.getDriver());
	   WebElement element =objPojo.getDriver().findElement(Loc_getConfigPortfPolio);
	   element.click();
	   actions.moveToElement(element);
	   
	    }
	    
	    public void checkProductsBuild() {
	    	objPojo.getDriver().findElement(Loc_getProductsBuild).click();
	    	
	    }
	    
	    public void checkPackageBuild() {
	    	objPojo.getDriver().findElement(Loc_getPackageBuild).click();
	    	
	    }
	    
	    public void getcheckModule() {
	    	objPojo.getDriver().findElement(Loc_checkModule).click();

	    }
	    
	   public void getNotification() {
	    	objPojo.getDriver().findElement(Loc_getNotifications).click();
	    	
	   }
	    
	    public void getQuotes() {
	    	Actions actions = new Actions(objPojo.getDriver());
	    	WebElement quotes =objPojo.getDriver().findElement(Loc_getQuotes);
	    	quotes.click();
	        actions.moveToElement(quotes);
	    }
	    
	    public void checkSearchButton() {
	    	objPojo.getDriver().findElement(Loc_checkSearchButton).click();
		
			WebElement elementSearch = objPojo.getDriver().findElement(Loc_checkSearchButton);
			elementSearch.sendKeys("Search");
			elementSearch.click();
		}
	    
	    public void getDashBoardRepots() {
	  	   objPojo.getDriver().findElement(Loc_getDashBoardRepots).click();
	}
	    	
	    public void checkQuotesForModeLoad() {
	    	WebElement element = objPojo.getDriver().findElement(Loc_checkSelectForModeLoad);
			Select selectLoad = new Select(element);
			selectLoad.selectByVisibleText("summary");
	   }
	    public void checkTasks() {
	    	objPojo.getDriver().findElement(Loc_checkTasks).click();

	    }	
	    public void checkOpenTasks() {
	    	objPojo.getDriver().findElement(Loc_checkOpenTasks).click();

	    }   
	    
	    public void checkCompletedTasks() {
	    	objPojo.getDriver().findElement(Loc_checkCompletedTasks).click();
	}  	
	    public void checkAlTasks() {
	    	objPojo.getDriver().findElement(Loc_checkAlTasks).click();
	  
	    }
	    
	    
	    }
	  
