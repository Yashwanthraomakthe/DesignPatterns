package strategyPattern;

public class ShareByEmail implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Sharing photo by email...");
    }
}