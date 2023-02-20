package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	
	//Declaration
	@FindBy(xpath = "")
	private WebElement pageHeader;
	@FindBy(id="")
	private WebElement SeleniumImage;
	@FindBy(id="")
	private WebElement cartArea;
    @FindBy(xpath ="")
    private WebElement facebookIcon;
    
    //Initialization
    public TestingPage(WebDriver driver) {
    	PageFactory.initElements(driver ,this);
    }
    
    //Utilization
    public String getPageHeader() {
		return pageHeader.getText();
    }
    
    public WebElement getSeleniumImage() {
    	return SeleniumImage;
    }
    
    public WebElement getCartArea() {
    	return cartArea;
    }
    
    public WebElement getFacebookIcon() {
    	return facebookIcon;
    }
    
    public void ClickFacebookIcon() {
    	facebookIcon.click();
    }
    
}