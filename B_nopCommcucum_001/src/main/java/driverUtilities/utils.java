package driverUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClasses.basefile;
import pomPageFiles.prodPage;

public class utils{

	private prodPage pp=new prodPage();
	public void scrolldown() {
		JavascriptExecutor js= (JavascriptExecutor) basefile.driver;
		int x= pp.prodd.getLocation().getX();
		int y=  pp.prodd.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) basefile.driver;	
		File src= ts.getScreenshotAs(OutputType.FILE);
		File des=new File (".//src/main/resources/snapshots/snaps.png");
		FileUtils.copyFile(src, des);
	}
	
}
