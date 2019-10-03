package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	
	
	private String returnChromeDriverPath(){
		return "C:\\Users\\CBecerra\\Downloads\\chromedriver_win32_76\\chromedriver.exe";
	}
	
	public WebDriver configureChromeDriver(WebDriver driver){
		System.setProperty("webdriver.chrome.driver", returnChromeDriverPath());
		driver = new ChromeDriver();
		return driver;
	}
	
	public void clickElement(String xpath, WebDriver driver) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void openWebDriver(WebDriver driver , String URL) {
		driver.get(URL);
	}
	
	public void closeWebDriver(WebDriver driver) {
		driver.quit();
	}
	
	public void playFirstResult(String xpath, WebDriver driver) {
		clickElement(xpath, driver)
	 }
	  
	public void sendKeys(WebDriver driver, String keys, String xpath) {
		driver.findElement(By.xpath(xpath)).sendkeys(keys);
	}

}
