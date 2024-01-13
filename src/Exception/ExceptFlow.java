package Exception;

class ExceptFlow {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Divided by 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index invalid");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}