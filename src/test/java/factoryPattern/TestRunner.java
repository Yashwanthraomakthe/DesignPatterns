package factoryPattern;

import org.openqa.selenium.WebDriver;

public class TestRunner {


    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser("chrome");
        browser.initialize();

        // If you need to access the WebDriver instance, cast the browser to the specific type
        WebDriver driver = ((MyChromeDriver) browser).getDriver();      

        // Now you can use the driver instance to interact with the browser
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.20.0");
        
        System.out.println(driver.getTitle());
        
        
        
        // Don't forget to close the browser when done
        driver.quit();
    }

}