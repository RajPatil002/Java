package InnerClasses;

/*
 * Outer class cannot access Inner class members.
 */
class Outer {
	int j = 20;

	void mainOut() {
		System.out.println("I am Outer ");
	}

	/*
	 * static Inner class can access static members of outer class
	 */
	static class Inside {
		int i = 10;

		void mainIn() {
//			only access when member is static
//			mainOut();
//			System.out.println("I am Inside " + j);
			System.out.println("I am Inside " + i);
		}
	}
}

public class StaticNestedInnerClass {
	public static void main(String[] args) {
		Outer os = new Outer();
		os.mainOut();
		Outer.Inside oi = new Outer.Inside();
		oi.mainIn();
	}
}
