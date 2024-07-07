package decoratorPattern;

public class SearchWidget extends WebPageDecorator {
    public SearchWidget(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int getRank() {
        return super.getRank() + 3; // rank added by search widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Search Widget";
    }
}

