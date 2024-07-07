package decoratorPattern;

public class AnalyticsWidget extends WebPageDecorator {
    public AnalyticsWidget(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int getRank() {
        return super.getRank() + 4; // rank added by analytics widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Analytics Widget";
    }
}