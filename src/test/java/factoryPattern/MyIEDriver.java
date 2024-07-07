package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyIEDriver implements Browser {
    private WebDriver driver;

    @Override
    public void initialize() {       
        driver = new InternetExplorerDriver();       
    }

    public WebDriver getDriver() {
        return driver;
    }
}

