package Exception;

class CustomeException extends ArithmeticException {

	CustomeException() {
		super();
	}

	CustomeException(String s) {
		super(s);
	}
}

public class ExceptClass implements AutoCloseable {
	float dividend;

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closed");

	}

	public ExceptClass(int a, int b) throws CustomeException {
		if (b == 0) {
			throw new CustomeException("b = 0");
		}
		System.out.println(a / b);
		this.dividend = a / b;
	}

	public static void main(String[] args) {
		// int a, b = 0;
		try (ExceptClass ec = new ExceptClass(10, 20);) {
			System.out.println(ec.dividend);
		} catch (CustomeException e) {
			// throw catched by catch
			System.out.println("Divided by 0" + e);
		} catch (Exception e) {
			System.out.println("Exception global");
		}
		System.out.println("Here");
	}
}