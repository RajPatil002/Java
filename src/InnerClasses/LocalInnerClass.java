package InnerClasses;

public class LocalInnerClass {
	int j = 30;

	void main() {
		/*
		 * LocalInner is defined inside block {}. This class has access to all member
		 * that are accessible in that block.
		 */
		class Inner {
			int i = 10;

			void main() {
				System.out.println("I am LocalInner " + i + j);
			}
		}
		Inner in = new Inner();
		in.i = 20;
		in.main();
	}

	public static void main(String[] args) {
		new LocalInnerClass().main();
		new LocalInnerClass();
	}

}
