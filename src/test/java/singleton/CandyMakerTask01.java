package singleton;

public class CandyMakerTask01 {

    private static volatile CandyMakerTask01 instance;
    private boolean empty;
    private boolean boiled;

    private CandyMakerTask01() {
        empty = true;
        boiled = false;
    }

    public static CandyMakerTask01 getInstance() {
        if (instance == null) {
            synchronized (CandyMakerTask01.class) {
                if (instance == null) {
                    instance = new CandyMakerTask01();
                }
            }
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and chocolate mix
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}