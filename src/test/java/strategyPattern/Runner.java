package strategyPattern;


public class Runner {
    public static void main(String[] args) {
        PhoneCameraApp basicApp = new BasicCameraApp();
        PhoneCameraApp plusApp = new CameraPlusApp();

        // Setting the share strategy for basicApp
        basicApp.setShareStrategy(new ShareByText());
        basicApp.takePhoto();
        basicApp.editPhoto();
        basicApp.savePhoto();
        basicApp.sharePhoto();

        System.out.println();

        // Changing the share strategy for plusApp
        plusApp.setShareStrategy(new ShareByEmail());
        plusApp.takePhoto();
        plusApp.editPhoto();
        plusApp.savePhoto();
        plusApp.sharePhoto();

        System.out.println();

        // Adding a new sharing strategy dynamically
        plusApp.setShareStrategy(new ShareBySocialMedia());
        plusApp.sharePhoto();
    }
}

