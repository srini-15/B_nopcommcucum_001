package pomPageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.basefile;

public class editProdpage {

	@FindBy(xpath="//*[@id=\"Name\"]")
	public WebElement edit;
	@FindBy(name="save")
	public WebElement save;
	
	
	public editProdpage() {
		PageFactory.initElements(basefile.driver, this);
	}
	
	public void edit(String name) {
		edit.sendKeys(name);
	}
	public void save() {
		save.click();
	}
	
}
