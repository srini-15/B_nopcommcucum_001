package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basefile {

	public static WebDriver driver = new ChromeDriver();
	
	public String title() {
		return driver.getTitle();
	}
	public String text() {
		return driver.getPageSource();
	}
}
