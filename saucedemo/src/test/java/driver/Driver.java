package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	/*** VARIABLES ***/
	// Driver
	private static WebDriver driver;

	/*** METHODS ***/
	// Driver configuration
	public static WebDriver configurate() {
		// WINDOWS
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver/138/chromedriver.exe");
		
		// LINUX
		// System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver/119/chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");

		driver = new ChromeDriver(options);

		return driver;
		
	}

	// Close connection
	public static void finish() {
		driver.quit();
		
	}
}