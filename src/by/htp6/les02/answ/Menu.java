package by.htp6.les02.answ;

import java.util.Scanner;

public class Menu {
	
	public int menu(){
		int menuPoint;
		
		while(true){
			showMenu();

			menuPoint = readUserAnswer();

			switch (menuPoint) {
			case 0:
			case 1:
				return menuPoint;
			}
		}
		
	}
	
	private void showMenu(){
		System.out.println("----------------------------");
		System.out.println("1 - calc");
		System.out.println("0 - exit");	
	}
	
	private int readUserAnswer(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> ");
		while(!sc.hasNextInt()){
			sc.nextLine();
			System.out.print("> ");
		}
		int value = sc.nextInt();
		
		return value;		
	}

}
