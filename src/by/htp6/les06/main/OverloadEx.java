package by.htp6.les06.main;

public class OverloadEx {

	public static void main(String[] args) {
		int x = 6;
		int[] mas1 = { 2, 4, 6, 8 };
		int[][] mas2 = { { 6, 7, 8 }, { 1, 2, 3 } };

		/*
		 * Printer.print(mas1);
		 * 
		 * Printer p = new Printer(); p.print("my array", mas1);
		 * 
		 * int f = Printer.print(8);
		 */

		// Printer.print(mas2);

		// System.out.p

		A a = new A();

		Number n = new Integer(2);

		int q = 5;// read from console

		if (q > 0) {
			n = new Integer(23);
		} else {
			n = new Double(4.5);
		}
		a.m(n);

		Object obj = n;
		Number n1 = (Number) obj;

	}

}

class A {

	public void m(Object ref) {
		System.out.println("Object");
	}

	public void m(Number ref) {
		System.out.println("Number");
	}

	public void m(Integer ref) {
		System.out.println("Integer");
	}

}

/*
 * class B extends A{
 * 
 * public int math(int x, String str){ return 45; } }
 */

class Printer {

	public static int print(int x) {
		System.out.println(x);
		return 1;
	}

	public static void print(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			System.out.print(x[i] + ", ");
		}
		System.out.println(x[x.length - 1]);
	}

	public void print(String message, int[] x) {
		System.out.println(message);
		for (int i = 0; i < x.length - 1; i++) {
			System.out.print(x[i] + ", ");
		}
		System.out.println(x[x.length - 1]);
	}

	private static void print(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
