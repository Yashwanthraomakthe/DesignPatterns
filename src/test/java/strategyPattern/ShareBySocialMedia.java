package strategyPattern;

public class ShareBySocialMedia implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Sharing photo on social media...");
    }
}