package StringHandling;

public class StringFormatter {

	public static void main(String[] args) {

		/*
		 * %x(hex), %o(oct), %n(newline), %a(float-hex), %h(hash), %e(scintific notation
		 * i.e. e^2), %g(use %f or %e whichever shorter), %t(time and date)
		 */
		System.out.println(String.format("%01d  %c  %f %05.2f %-20s %b", 10, 'c', 20.0, 30., "string", true));

		/*
		 * Strings (%[width].[precision]s):
		 * 
		 * %-20s - Left align (this will add spaces before string if string is smaller
		 * than specified length i.e. 20)
		 * %20s - Right align (this will add spaces after string if string is smaller
		 * than specified length i.e. 20)
		 * %.7s - Fixed length (fixed length string)
		 * 
		 * 
		 * Numbers (%[width].[precision]f and %0[width]d):
		 * 
		 * %.2f - Fixed precision (this will limit float to fixed decimal)
		 * %05d - Left align with '0' padding only for integer
		 */

	}

}
