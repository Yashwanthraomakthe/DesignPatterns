package decoratorPattern;

public class Runner {
    public static void main(String[] args) {
        WebPage mobilePage = new MobileWebPage();
        WebPage desktopPage = new DesktopWebPage();

        System.out.println(mobilePage.getDescription() + " has rank: " + mobilePage.getRank());
        System.out.println(desktopPage.getDescription() + " has rank: " + desktopPage.getRank());

        // Adding widgets to the mobile page
        mobilePage = new SearchWidget(mobilePage);
        mobilePage = new ChatWidget(mobilePage);
        System.out.println(mobilePage.getDescription() + " has rank: " + mobilePage.getRank());

        // Adding widgets to the desktop page
        desktopPage = new AnalyticsWidget(desktopPage);
        desktopPage = new SearchWidget(desktopPage);
        System.out.println(desktopPage.getDescription() + " has rank: " + desktopPage.getRank());
    }
}
