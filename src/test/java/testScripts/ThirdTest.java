package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass{
	
	@Test
	public void thirdTest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javavideo.getPageHeader(),"Core Java For Selenium Training");
		
		javavideo.clickclosecookies();
		web.switchToFrame();
		javavideo.clickPlayButton();
		Thread.sleep(2000);
		javavideo.clickPauseButton();
		
		web.switchBackFromFrame();
		
		javavideo.clickAddToWishlist();
		
		soft.assertAll();
	}

}
