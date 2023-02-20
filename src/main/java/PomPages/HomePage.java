package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy(xpath = "//img[@alt'SkillRary']")
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement searchTF;
	@FindBy(xpath = "//input[@value = go']")
	private WebElement searchButton;
	@FindBy(xpath = "//a[. = ' Gears ']")
	private WebElement gearsTab;
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu gear_menu')]/descendant::a[. = 'skillRary Demo App']")
	private WebElement demoAppLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver , this);
		}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
		}
	
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
		}
	
	public void clickGears() {
		gearsTab.click();
		}
	
	public void clickSkillrarydemoApp() {
		demoAppLink.click();
		
	}
}
