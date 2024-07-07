package singleton;

public class EarlyInitialization {

	private EarlyInitialization() {

	}

	private static final EarlyInitialization Instance = new EarlyInitialization();

	public static EarlyInitialization getIntance() {
		return Instance;
	}
}
