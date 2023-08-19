package pomPageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.basefile;

public class homePage {
	@FindBy(xpath="((//a[@class=\"nav-link\"])[4]/descendant::i)[1]")
	public WebElement catalogbtn;
	
	@FindBy(xpath="//p[text()=' Products']")
	public WebElement prod;

	
	public homePage() {
		PageFactory.initElements(basefile.driver, this);
	}
	
	public void catalog() {
		catalogbtn.click();
	}
	
	public void produc() {
		prod.click();
	}
}
