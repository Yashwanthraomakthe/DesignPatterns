package factoryPattern;

import org.openqa.selenium.WebDriver;

public class TestRunnerGOF {
	public static void main(String[] args) {
		ChromeBrowserFactory factory1;
		ChromeBrowserWithCapabilitiesFactory factory2;

		// For normal ChromeDriver
		//factory1 = new ChromeBrowserFactory();
		//Browser browser = factory1.createBrowser();
		//browser.initialize();

		// If you need to access the WebDriver instance, cast the browser to the
		// specific type
		//WebDriver driver = ((MyChromeDriver) browser).getDriver();

		// Now you can use the driver instance to interact with the browser
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.20.0");

		//System.out.println(driver.getTitle());

		// Don't forget to close the browser when done
		//driver.quit();
		
		

		// For ChromeDriver with capabilities
		factory2 = new ChromeBrowserWithCapabilitiesFactory();
		Browser browser = factory2.createBrowser();
		browser.initialize();

		// If you need to access the WebDriver instance, cast the browser to the
		// specific type
		WebDriver driver2 = ((MyChromeDriver) browser).getDriver();

		// Now you can use the driver instance to interact with the browser
		driver2.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.20.0");

		System.out.println(driver2.getTitle());

		// Similar calls can be made for Firefox and IE
	}
}
