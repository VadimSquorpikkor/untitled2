package by.htp6.les04.array;

import java.util.Date;

public class Array4 {

	public static void main(String[] args) {
		/*Student[] mas = new Student[2][3];
		mas[0][0] = new Student("jgh");
		
		Date[][] mas2 = new Date[2][3];
		
		Date[][] copy = new Date[2][3];
		for(int i=0; i< mas2.length; i++){
			for(int j=0; j< mas2[i].length; j++){
					Date s = (Date) mas2[i][j].clone();	
					copy[i][j] = s;
			}	
			
			System.out.println();
		}*/
		
	/*	int[] a = {1,2,3,4};
		System.out.println(a[4]);*/
		
		Object obj = new String();
		
		Object[] x = new String[3];
		x[0] = new Integer(3);
		
		A[] vb = new A[5];
		vb[0] = new A();
		vb[0] = new B();
		
		
		int[][] n = {
				{2,6},
				{3,4},
				{5,6}
		};
	}

}

class A{}
class B extends A{}
