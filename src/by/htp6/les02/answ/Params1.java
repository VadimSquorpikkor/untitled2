package by.htp6.les02.answ;

import java.util.Date;
import java.util.Scanner;

public class Params1 {

	public static void main(String[] args) {
		String str = "Enter a:";
		String Str2 = new String("asdasdasd");
		Date date = new Date();

		int a;
		int b;


		a = readIntValue("Enter a");
		b = readIntValue("Enter b");


		int d = 9;
		meth(d);// фактический

	}

	private static int readIntValue(String message){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message + "> ");
		while(!sc.hasNextInt()){
			sc.nextLine();
			System.out.print(message + "> ");
		}
		int value = sc.nextInt();

		return value;
	}

	private static void meth(int x){//формальный
		int c = 0;
		x++;
		a(x);
		x--;
	}

	private static void a(int as){//формальный
		as = as + 7;
		b(8);

	}

	private static void b(int x){//формальный
		System.out.println("!!!!");
	}

}
