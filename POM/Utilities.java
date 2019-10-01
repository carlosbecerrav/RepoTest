package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	
	private String returnChromeDriverPath(){
		return "C:\\Users\\CBecerra\\Downloads\\chromedriver_win32_76\\chromedriver.exe";
	}
	
	public WebDriver configureChromeDriver(WebDriver driver){
		System.setProperty("webdriver.chrome.driver", returnChromeDriverPath());
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriverWait configureWait(WebDriver driver, WebDriverWait wait) {
		wait = new WebDriverWait(driver,10);
		return wait;
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
	
	public void TypeInSearchBar(WebDriver driver,String SearchBar, String text) {
		driver.findElement(By.xpath(SearchBar)).sendKeys(text);
	}
	

}
