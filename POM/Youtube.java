package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube {
	
	//elements
	String logoYoutube = "//div[@id='logo-icon-container'][1]";
	String searchBar = "//input[@id='search']";
	String searchButton = "//button[@id='search-icon-legacy']";
	String videoItem = "//a[contains(text(),'Audioslave - Like a Stone (Official Video)')]";
	String VideoAudioSlaveURL = "https://www.youtube.com/watch?v=7QU1nvuxaMA";
	
	
	//methods
	public boolean isLogoYoutubeVisible(WebDriver driver) {
		return driver.findElement(By.xpath(logoYoutube)).isDisplayed();
	}
	
	public void WaitUntilSearchBarIsVisible(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchBar)));
		}
	
	public void WaitUntilVideoItemIsVisible(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(videoItem)));
		}
	
	public void WaitUntilSearchButtonIsVisible(WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchButton)));
		}
	
	public void TypeTextOnSearchBar(WebDriver driver,Utilities tool, String text) {
		tool.TypeInSearchBar(driver, searchBar, text);
		}
	
	
	
	public void clickSearchBarButton(WebDriver driver, Utilities tool) {
		tool.clickElement(searchButton, driver);
	}
	
	public void clickVideoItem(WebDriver driver, Utilities tool) {
		tool.clickElement(videoItem, driver);
	}
	
	public Boolean CheckURLVideo(WebDriver driver) {
		String CurrentURL = driver.getCurrentUrl();
		Boolean isURLExpected = CurrentURL.contentEquals(VideoAudioSlaveURL);
		return isURLExpected;
	}
	
	
	

}
