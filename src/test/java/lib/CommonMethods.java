package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumberOptions.base;

public class CommonMethods {
	
	public boolean WaitForElementClickable(String locator, int Timeout)
	{
		boolean blnFlag=false;
		WebDriverWait wait= new WebDriverWait(base.driver, Timeout);
		try{
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
			blnFlag=(ele!=null);
		
		}catch(Exception ex){
			
		}
		return blnFlag;
	}
	
	

}
