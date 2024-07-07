package decoratorPattern;

public class ChatWidget extends WebPageDecorator {
    public ChatWidget(WebPage webPage) {
        super(webPage);
    }

    @Override
    public int getRank() {
        return super.getRank() + 2; // rank added by chat widget
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Chat Widget";
    }
}
