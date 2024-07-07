package decoratorPattern;

public class DesktopWebPage implements WebPage {
    @Override
    public int getRank() {
        return 10; // base rank for desktop version
    }

    @Override
    public String getDescription() {
        return "Desktop Web Page";
    }
}
