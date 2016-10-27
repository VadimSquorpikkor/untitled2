package by.htp6.les02.answ;

public class MenuInspertor {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		int value;
		value = menu.menu();
		while( (value = menu.menu()) != 0){
			switch (value){
			case 1: System.out.println("One");   break;
			case 0: System.out.println("Exit");  break;
			}
		}
		System.out.println("Exit");
	}

}
