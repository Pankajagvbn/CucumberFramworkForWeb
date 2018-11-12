package cucumberOptions;

import lib.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.util.Arrays;
import java.util.HashMap;

public class base {
    public static WebDriver driver;
    public static CommonMethods lib= new CommonMethods();
    @BeforeTest()
    @Parameters(value={"config", "environment"})
    public WebDriver setUp(String config_file, String environment) throws Exception {
		System.setProperty("webdriver.chrome.driver", "BrowerExe/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", "");
		options.addArguments("disable-infobars");
		options.addArguments(Arrays.asList("--disable-extensions","disable-infobars","disable-infobars"));						
		options.setExperimentalOption("excludeSwitches", Arrays.asList("test-type","ignore-certificate-errors"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		return driver;
    }

    @AfterTest()
    public void tearDown() throws Exception {
        driver.quit();
    }
}