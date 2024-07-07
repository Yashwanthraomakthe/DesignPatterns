package factoryPattern;

public class ChromeBrowserWithCapabilitiesFactory extends BrowserFactoryGOF {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriverWithCapabilities();
    }
}