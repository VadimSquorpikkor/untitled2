package by.htp6.les03.quest;

public class Type1 {

	public static void main(String[] args) {
		// явное неявное
		int x = 89;
		long y;
		
		y = x;
		
		x = (int)y;
		//long64 = int32;
		
		double d = 6.7;
		int z;
		
		z = (int)d;
		
		
		int c = 1234567890;
		float f;//32
		f = c;
		
		System.out.println(f);
		System.out.println(c);
		
		
		byte b1=10, b2=20, b3=127;
		
		int v;
		v = b1* b2 * b3;
		System.out.println(v);
		
		Character ch;
		Boolean bool;
		bool = true;
		
		Void d6 = null;
		
		Integer vg = 9;
	}

}
