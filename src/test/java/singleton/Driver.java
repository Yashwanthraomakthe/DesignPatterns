package singleton;

public class Driver {

	public static void main(String[] args) {
		// EarlySingleton es = new EarlySingleton(); //as EarlySingleton is having
		// private we cant create object

		/**
		 * Below code is for Early Initialization
		 */
		EarlyInitialization es1 = EarlyInitialization.getIntance();
		EarlyInitialization es2 = EarlyInitialization.getIntance();

		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es1 == es2); // true

		/**
		 * Below code is for lazy initialization
		 */
		LazyInitialization li1 = LazyInitialization.getInstance();
		LazyInitialization li2 = LazyInitialization.getInstance();

		System.out.println(li1);
		System.out.println(li2);
		System.out.println(li1 == li2); // true

	}

}
