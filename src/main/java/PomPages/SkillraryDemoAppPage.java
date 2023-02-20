package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//Declaration
	@FindBy(xpath = "//div[@class ='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement SeleniumTrainingLink;
	@FindBy(name = "addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()=' contact us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	//Utilization
	
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void mouseHoverTocourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		SeleniumTrainingLink.click();
	}
	
	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropdown, index);
	}
	
	public void clickcontactUs() {
		contactUsLink.click();
		}

}
