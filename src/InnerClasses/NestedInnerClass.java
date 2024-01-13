package InnerClasses;

/*
 * Outer class cannot access Inner class members.
 */
class Outside {
	int j = 20;

	void main() {
		System.out.println("I am Outside ");
	}

	/*
	 * Inner class can access all members of outer class
	 */
	class Inside {
		int i = 10;

		void main() {
			System.out.println("I am Inside " + i + j);
		}
	}
}

public class NestedInnerClass {

	public static void main(String[] args) {
		Outside ic = new Outside();

//		creating object require obj of Outer class
		Outside.Inside is = new Outside().new Inside();
		ic.main();
		is.main();
		System.out.println();
	}

}
