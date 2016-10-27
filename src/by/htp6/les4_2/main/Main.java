package by.htp6.les4_2.main;

import java.util.ArrayList;

import by.htp6.les4_2.entity.Book;
import by.htp6.les4_2.entity.ProgrammerBook;

public class Main {

	public static void main(String[] args) {
		NewYearTree tree = new NewYearTree();
		tree.повеситьИгрушку(new Toy());
		tree.повеситьИгрушку(new Toy());
		tree.повеситьИгрушку(new Toy());
		tree.повеситьИгрушку(new Toy());
		tree.повеситьИгрушку(new Toy());
		
		
		ArrayList<Toy> t = tree.getToys();
		int price = 0;
		for(int i=0; i<t.size(); i++){
			Toy toy = t.get(i);
			price = price + toy.getPrice();
		}
			
		
		Book b = new ProgrammerBook();
		//b.
		ProgrammerBook b2 = new ProgrammerBook();

		Человек чел = new Доктор();
		Доктор док = (Доктор)чел;




	}

}

class Человек{

}

class Доктор extends Человек{

}


