package by.htp6.les09.ex;

public class ExceptionEx {

	public static void main(String[] args) {
		int k = 7;
		int z;

		int charity = -100;
		try {
			 z = k / 0;
			/* 
			 * // Throwable
			 * 
			 * String s = null;
			 * 
			 * s.length();
			 */
			//m();

			try {

				if (charity <= 0) {
					IllegalArgumentException ref = new IllegalArgumentException();
					throw new OutOfMemoryError();
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

			System.out.println("z");

		} catch (ArithmeticException e) {
			System.out.println("x");
			throw new NullPointerException();
		} catch (NullPointerException e) {

		} catch (Exception e) {
			System.out.println("y");
		}

		System.out.println("aaa");
	}
	
	public static void m(){
		System.out.println("a");
		m();
	}

}
