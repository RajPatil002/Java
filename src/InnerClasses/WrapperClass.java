package InnerClasses;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper classes are class that represents each primitive data types.These
		 * classes are immutable and used to convent primitive data types to objects and
		 * vice versa.These class are also used in collections with generic.
		 */

		Integer i = 20;
		Float f = (float) 10.0;
		Double d = 10.0;
		Character c = 'c';
		Boolean b = true;

		/*
		 * valueOf() and parse() are static methods used to convert string to data type
		 * or vice versa. There are many methods like compareTo(), equals() for
		 * operations.
		 */

		// static method compare returns relation of 1st argu w.r.t 2nd argu.
		System.out.println(Integer.compare(10, 20));
		System.out.println("" + i + f + d + c + b);

	}

}
