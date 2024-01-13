package Exception;

import java.io.FileInputStream;

class ExceptThrow {
	void Divide(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		else
			System.out.println(a / b);
	}

	public static void main(String[] args) {
		try (FileInputStream f = new FileInputStream("")) {
			ExceptThrow e = new ExceptThrow();
		} catch (Exception ex) {
			// TODO: handle exception
		}
		System.out.println("Here");
	}
}