package factoryPattern;

public class ChromeBrowserFactory extends BrowserFactoryGOF {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriver();
    }
}