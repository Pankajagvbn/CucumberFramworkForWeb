package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.base;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Google extends base {
	
	
    @Given("^Launch Google Website$")
    public void LaunchApplication() throws Throwable {
    	boolean blnFlag=false;
        driver.get("https://www.google.com/ncr");
        blnFlag=lib.WaitForElementClickable("//input[@name='q']",20);
        assertTrue(blnFlag,"Search text box not found.");
    }

    @When("^Search a Keyword$")
    public void SearchKeyWord() throws Throwable {
    	 WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("selenium hq");
    }

    @Then("^Verify the result$")
    public void VerifySearchResult() throws Throwable {
    	boolean blnFlag=false;
    	blnFlag=lib.WaitForElementClickable("//input[@name='btnK']",20);
    	driver.findElement(By.name("btnK")).click();
    	blnFlag=lib.WaitForElementClickable("//div/a[@href='https://www.seleniumhq.org/']",20);
    	assertTrue(blnFlag,"Selenium HQ link not found.");
    }
}
