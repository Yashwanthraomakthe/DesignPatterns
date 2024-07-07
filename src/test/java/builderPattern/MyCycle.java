package builderPattern;

public class MyCycle {

	public static void main(String[] args) {
        Bicycle bicycle = new Bicycle.Builder()
                .setGears(true)
                .setDoubleStands(true)
                .setDoubleSeats(false)
                .setCarrier(true)
                .build();

        System.out.println(bicycle);
    }
}
