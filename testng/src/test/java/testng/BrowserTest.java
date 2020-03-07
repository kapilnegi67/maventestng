/**
 * 
 */
package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author kapilnegi
 *
 */
public class BrowserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/kapilnegi/Desktop/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();

	}

}
