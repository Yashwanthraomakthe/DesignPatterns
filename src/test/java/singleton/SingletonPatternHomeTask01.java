package singleton;

public class SingletonPatternHomeTask01 {

	private static SingletonPatternHomeTask01 instance;
	private boolean empty;
	private boolean boiled;

	private SingletonPatternHomeTask01() {
		empty = true;
		boiled = false;
	}

	public static SingletonPatternHomeTask01 getInstance() {
		if (instance == null) {
			synchronized (SingletonPatternHomeTask01.class) {
				if (instance == null) {
					instance = new SingletonPatternHomeTask01();
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
