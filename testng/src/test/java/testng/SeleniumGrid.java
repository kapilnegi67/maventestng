package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
  @Test
  public void testGrid() throws InterruptedException {
	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  capabilities.setPlatform(Platform.MAC);
	  URL url = null;
	try {
		url = new URL("http://localhost:4444/wd/hub");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  WebDriver driver = new RemoteWebDriver(url, capabilities);
	  driver.get("https://www.google.com");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
