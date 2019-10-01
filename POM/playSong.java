package POM;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

//JUnit way
class playSong {
	
	//declare instances
	static Utilities tools;
	static Youtube youtubePage;
	static WebDriver chrome;
	static String title, URL;
	static WebDriverWait wait;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//prepare everything for testing
		tools = new Utilities();
		youtubePage = new Youtube();
		chrome = tools.configureChromeDriver(chrome);
		wait = tools.configureWait(chrome, wait);
		title = "Like a Stone";
		URL = "https://www.youtube.com";
	}

	@SuppressWarnings("deprecation")
	@Test
	void playASong() throws InterruptedException {
		tools.openWebDriver(chrome, URL);
		youtubePage.WaitUntilSearchBarIsVisible(wait);
		youtubePage.TypeTextOnSearchBar(chrome, tools, title);
		youtubePage.WaitUntilSearchButtonIsVisible(wait);
		youtubePage.clickSearchBarButton(chrome, tools);
		youtubePage.WaitUntilVideoItemIsVisible(wait);
		youtubePage.clickVideoItem(chrome, tools);
		
		Thread.sleep(10000);
		Assert.assertTrue("The audioslave Video is displayed", youtubePage.CheckURLVideo(chrome));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		chrome.quit();
	}
}
