package pomPageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.basefile;

public class prodPage {

	@FindBy(xpath="//*[@id=\"SearchProductName\"]")
	public WebElement prodname;
	
	@FindBy(xpath="//*[@id=\"search-products\"]")
	public WebElement search;
	
	@FindBy(xpath="//*[@id=\"products-grid\"]/tbody/tr[1]")
	public WebElement prodd;
	
	@FindBy(xpath="(//a[@class=\"btn btn-default\"])[1]")
	public WebElement edit;
	
	public prodPage() {
		PageFactory.initElements(basefile.driver, this);
	}
	
	public void prod(String name) {
		prodname.sendKeys(name);
	}
	public void search() {
		search.click();
	}
	
	public void edit() {
		edit.click();
	}
}
