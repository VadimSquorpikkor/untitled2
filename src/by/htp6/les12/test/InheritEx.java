package by.htp6.les12.test;

public class InheritEx {

	public static void main(String[] args) {
		Man man = new Doctor();
		man = new HeadDoctor();

		 meth(new Man());
		 meth(new Doctor());
		meth(new HeadDoctor());

	}

	public static void meth(Man man) {

		Doctor doc;
		if (man.getClass() == Doctor.class) {
			doc = (Doctor)man;
			System.out.println("aaa");
		} else if (man.getClass() == HeadDoctor.class) {
			doc = (Doctor)man;
			System.out.println("aaa");
		}
	}

	public static void meth2(Man man) {

		Doctor doc;
		if (man instanceof Doctor) {
			doc = (Doctor)man;
			System.out.println("aaa");
		} 
	}
	
	
	public static void meth3(Man man) {

		Doctor doc;
		
		if(man == null){
			doc = new Doctor();
		}else{
			doc = null;
		}
		
		System.out.println(doc);
		
	}
}

class Man {
}

class Doctor extends Man {
}

class HeadDoctor extends Doctor {
}
