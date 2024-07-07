package singleton;

public class LazyInitialization {

	private LazyInitialization() {

	}

	private static LazyInitialization Instance = new LazyInitialization();

	public static LazyInitialization getInstance() {
		if (Instance == null) {
			synchronized (LazyInitialization.class) {
				if (Instance == null) {
					return Instance = new LazyInitialization();
				}
			}
		}
		return Instance;
	}

}
