package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	
	@Test
    public void firstTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
		
		SkillraryDemo.mouseHoverTocourse(web);
		SkillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.gtePageHeader(),"Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitlywait(time,selenium.getItemAddedMessage());
		web.takescreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}
}
