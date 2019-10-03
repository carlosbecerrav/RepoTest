package POM;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;

public class test_youtube {
	//declaring the objects we will need
	static Utilities util;
	static WebDriver driver;
	static Youtube youtube;

	public static void main(String[] args) throws InterruptedException {
		//calling the utilities object to use it,creating an utilities object
		 util = new Utilities();
		 youtube = new Youtube();
		 
		 //configuring webdriver  and saving them into the same variable
		 driver = util.configureChromeDriver(driver);
		 //once browser is configured now we can use it
		 
		 //opening youtube
		 util.openWebDriver(driver, "https://www.youtube.com");
		 
		 util.sendKeys(driver, "toxic shitty flute", youtube.searchBar);
		 util.clickElement(youtube.searchButton, driver);
		
		
		 //wait for see the action
		 Thread.sleep(2000);
		 
		 if (youtube.anyVideoResult(driver)) {
		     util.playFirstResult(youtube.targetVideo, driver);
		 } else {
			 System.out.println('No video results');
		 }
		 
		 //close the webdriver
		 util.closeWebDriver(driver);
		 
		 
	}


}
