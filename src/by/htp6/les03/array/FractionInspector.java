package by.htp6.les03.array;

public class FractionInspector {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(6, 14);

		System.out.println(fr1.getCh()+"/"+fr1.getZn());
		
		fr1.sork();
		
		System.out.println(fr1.getCh()+"/"+fr1.getZn());
		
		Fraction fr2 = new Fraction(6, 14);
		Fraction fr3 = new Fraction(3, 4);
		Fraction fr4;		
	
		
		fr4 = fr2.add(fr3);
		fr4.sork();
		
		System.out.println(fr4.getCh()+"/"+fr4.getZn());
	}

}
