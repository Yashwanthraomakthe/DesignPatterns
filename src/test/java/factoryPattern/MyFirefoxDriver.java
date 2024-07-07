package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {     
        driver = new FirefoxDriver();       
    }

    public WebDriver getDriver() {
        return driver;
    }
}
