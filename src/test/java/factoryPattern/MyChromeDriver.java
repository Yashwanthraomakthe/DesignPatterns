package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {       
        driver = new ChromeDriver();
       
    }

    public WebDriver getDriver() {
        return driver;
    }
}
