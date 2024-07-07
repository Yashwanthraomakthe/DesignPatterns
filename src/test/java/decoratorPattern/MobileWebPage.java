package decoratorPattern;

public class MobileWebPage implements WebPage {
    @Override
    public int getRank() {
        return 5; // base rank for mobile version
    }

    @Override
    public String getDescription() {
        return "Mobile Web Page";
    }
}