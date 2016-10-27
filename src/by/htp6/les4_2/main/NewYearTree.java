package by.htp6.les4_2.main;

import java.util.ArrayList;

public class NewYearTree {
	//Toy[] toys;
	ArrayList<Toy> toys = new ArrayList<Toy>();
	
	
    public void повеситьИгрушку(Toy toy){
		toys.add(toy);
	}
    
    public ArrayList getToys(){
    	return toys;
    }

}
