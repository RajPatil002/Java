package InnerClasses;

class Anonymous {
	int i = 10;

	void main() {
		System.out.println("Anonymous Main " + i);
	}

	void main2() {
		System.out.println("Main 2's " + i);
	}

}

public class AnonymousClass {

	public static void main(String[] args) {
		/*
		 * We redeclare class and its members in Anonymous class. Mostly used for
		 * instantiating interface
		 */
		Anonymous a = new Anonymous() {
			/*
			 * This i is used with overrided methods
			 */
			int i = 20;

			@Override
			public void main() {
				System.out.println("Redefined Anonymous Main " + i);
			}
		};
		// System.out.println(a.i);
		a.main();
		a.main2();
		Anonymous b = new Anonymous();
		b.main();
	}

}
