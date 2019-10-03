package POM;

public class Youtube {
  String searchBar = "//input[@id='search']";
  String searchButton = "//button[@id='search-icon-legacy']";
		  //String targetVideo = "(//ytd-search//div[@id='primary']//div[@id='contents']//a[@id='video-title'])[1]";
  String targetVideo = "(//ytd-two-column-search-results-renderer//a[@id='thumbnail'])[1]";
  String videoResult = "//ytd-two-column-search-results-renderer//a[@id='thumbnail']";
  
  public boolean anyVideoResult(WebDriver driver) {
	  return driver.findElement(BY.xpath(videoResult)).length() > 0;
  }
  
 
}
