package decoratorPattern;

public abstract class WebPageDecorator implements WebPage {
    protected WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public int getRank() {
        return webPage.getRank();
    }

    @Override
    public String getDescription() {
        return webPage.getDescription();
    }
}
