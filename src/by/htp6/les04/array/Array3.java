package by.htp6.les04.array;

import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		int[][] ar = new int[3][4];
		//int[][][] ar3 = new int[3][4][5];
		
		for(int i=0; i< ar.length; i++){
			for(int j=0; j< ar[i].length; j++){
				ar[i][j] = i+j;				
			}		
		}
		
		int[][] ar2 = new int[3][];
		ar2[0] = new int[3];
		ar2[1] = new int[5];
		ar2[2] = new int[4];
		
		Random rand = new Random();
		for(int i=0; i< ar2.length; i++){
			for(int j=0; j< ar2[i].length; j++){
				ar2[i][j] = rand.nextInt(1000);				
			}		
		}
		
		
		for(int i=0; i< ar2.length; i++){
			for(int j=0; j< ar2[i].length; j++){
				System.out.printf("[%-3d] ", ar2[i][j]);				
			}	
			System.out.println();
		}
		
		
		int[] q = {1,2,3};
		
		int[][] qq = { {1,2,3}, {4,5}, {6,7,8,9}};
		
		int[][][] s = new int[2][3][4];
		
		s[0][1][1] = 6;
	}

}
