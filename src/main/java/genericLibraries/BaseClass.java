package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.ContactUsPage;
import PomPages.CoreJavaForSeleniumPage;
import PomPages.CoreJavaVideoPage;
import PomPages.HomePage;
import PomPages.SeleniumTrainingPage;
import PomPages.SkillraryDemoAppPage;
import PomPages.TestingPage;

public class BaseClass {
   protected PropertiesFileUtility property;
   protected ExcelUtility Excel;
   protected WebDriverUtility web;
   protected WebDriver driver;
   protected HomePage home;
   protected SkillraryDemoAppPage SkillraryDemo;
   protected SeleniumTrainingPage selenium;
   protected TestingPage testing;
   protected CoreJavaForSeleniumPage coreJava;
   protected CoreJavaVideoPage javavideo;
   protected ContactUsPage contact;
   protected long time;
 
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfiguration() {
		property = new PropertiesFileUtility();
		Excel = new ExcelUtility();
		web = new WebDriverUtility();
		
		property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		Excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	}
		
	@BeforeMethod
	public void methodConfiguration() {
		long time = Long.parseLong(property.fetchProperty("timeouts"));
		driver = web.openApplication(property.fetchProperty("browser"),property.fetchProperty("url"),time);
		home = new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		SkillraryDemo = new SkillraryDemoAppPage(driver);
        selenium = new SeleniumTrainingPage(driver);
        coreJava = new CoreJavaForSeleniumPage(driver);
        javavideo = new CoreJavaVideoPage(driver);
        testing = new TestingPage(driver);
        contact = new ContactUsPage(driver); 
        		
  	}
	
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
		
	}
	@AfterClass
	public void classTearDown() {
	Excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}