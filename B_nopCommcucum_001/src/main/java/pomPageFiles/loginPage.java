package pomPageFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.basefile;

public class loginPage {
//	private basefile bf;
	@FindBy(xpath="//*[@id=\"Email\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	public WebElement pass;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	private WebElement login;
	
	public loginPage() {
		PageFactory.initElements(basefile.driver, this);
	}
	
	public void email(String mail) {
		email.sendKeys(mail);
	}
	public void pass(String pas) {
		pass.sendKeys(pas);
	}
	public void login() {
		login.click();
	}
	
}
