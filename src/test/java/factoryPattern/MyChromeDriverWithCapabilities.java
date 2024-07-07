package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {       
        ChromeOptions options = new ChromeOptions();       
        options.addArguments("--disable-infobars");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        System.out.println("ChromeDriver with capabilities initialized");
    }

    public WebDriver getDriver() {
        return driver;
    }
}

