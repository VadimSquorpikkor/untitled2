package by.htp6.les03.quest;

public class Oper1 {

	public static void main(String[] args) {
		int x1 = 9;
		int x2 = 8;

		int z = x1 | x2;

		System.out.println(z);

		if (f1() | f2()) {

		}

		int a, b, c, d, e = 8, f = 1;

		a = b = c = d = e + f + 9;
		a = b = ++c - (c++)/f--; 
		// and true and true
		//
	}

	public static boolean f1() {
		return true;
	}

	public static boolean f2() {
		return false;
	}

}
