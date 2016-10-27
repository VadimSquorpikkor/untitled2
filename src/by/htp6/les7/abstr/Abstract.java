package by.htp6.les7.abstr;

public class Abstract {
	
	public static void main(String[] args){
		AlivePerson ref = new Animal();
		ref.breathe();
	}
	
	

}

abstract class AlivePerson{
	
	public AlivePerson(){}
	
	
	public abstract void breathe();
	
	
}

 class Animal extends AlivePerson{

	@Override
	public void breathe() {

		
	}

}
