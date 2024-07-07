package strategyPattern;

public class ShareByText implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Sharing photo by text...");
    }
}