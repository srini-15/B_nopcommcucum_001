package appHooks;

import java.time.Duration;

import baseClasses.basefile;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class firstHook extends basefile{

	@Before
	public void open() {
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@After
	public void close() {
		driver.quit();
	}
}
