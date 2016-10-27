package by.htp6.les05.main3;

public class Main2 {
	
	public static void main(String[] args){
		Пирог мойЛюбимыйПирог = new СуперПирог();

		Пекарь пекарь1 =  new Пекарь();
		Пекарь пекарь2 =  new Мастер();

		Пирог пирог1 = пекарь1.печьПирог();
		Пирог пирог2 = пекарь2.печьПирог();
		
	}

}


class Пирог{}
class СуперПирог extends Пирог{}


class Пекарь{

	public Пирог печьПирог(){
		return new Пирог();
	}
}

class Мастер extends Пекарь{

	@Override
	public СуперПирог печьПирог(){
		return new СуперПирог();
	}

}