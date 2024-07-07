package strategyPattern;

public abstract class PhoneCameraApp {
    private ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    public abstract void editPhoto();

    public void savePhoto() {
        System.out.println("Saving photo...");
    }

    public void sharePhoto() {
        if (shareStrategy != null) {
            shareStrategy.share();
        } else {
            System.out.println("No share strategy set.");
        }
    }
}

