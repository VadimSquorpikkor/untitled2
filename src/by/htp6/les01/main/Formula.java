package by.htp6.les01.main;

import java.util.Scanner;

public class Formula {
	
	public static void main(String[] args){
		
		int x;
		int y;
		
	
		int i = 0;
		Scanner conin = new Scanner(System.in);

		/*System.out.print(">");
		i = conin.nextInt();
		
		System.out.print(">");
		x = conin.nextInt();
		
		
		String str;
		str = conin.nextLine();
		
		System.out.println("-- " + i + " -- " + x);*/
		
		System.out.print(">");
		while(!conin.hasNextInt()){
			System.out.println("incorrect input");
			System.out.print(">");
			conin.nextLine();
		}
		x = conin.nextInt();
		
		System.out.println("x=" + x);
		/*if(conin.hasNextInt())
		{
			i = conin.nextInt();
			System.out.println("i="+i);
		}else{
			System.out.println("!!!!!!!");
		}*/

		
	}
	
	

}
