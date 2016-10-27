package by.htp6.les03.array;

public class Fraction {
	private int ch;
	private int zn;

	// конструктор - это метод класса, который вызвается вместе с оператором new
	// имя его совпадает с именем классаБ конструктор ничего не возвращает
	// и предназначен для инициализации объекта

	public Fraction() {
		ch = 0;
		zn = 1;
	}

	// конструкторов в классе может быть несколько
	// они должны отличатся количество и-или типами параметров

	public Fraction(int value) {
		ch = value;
		zn = value;
	}

	public Fraction(int _ch, int _zn) {
		ch = _ch;
		zn = _zn;
	}

	// наличие нескольких конструкторов в класс =называется ПЕРЕГРУЗКОЙ
	// конструкторов

	public void setCh(int _ch) {
		ch = _ch;
	}

	public void setZn(int _zn) {
		zn = _zn;
	}

	public int getCh() {
		return ch;
	}

	public int getZn() {
		return zn;
	}

	public void sork() {//сократить
		int nod;
		
		nod = nod();

		ch = ch/nod;
		zn = zn/nod;
		
	}
	
	
	private int nod(){
		int nod;
		if (ch < zn) {
			nod = ch;
		} else {
			nod = zn;
		}

		// переписать другим способом
		while (nod > 1) {
			if (((ch % nod) == 0) & ((zn % nod) == 0)) {
				break;
			}
			nod--;
		}
		
		return nod;
	}
	
	//сравнивать
	public Fraction add(Fraction fr){
		// ch, zn
		// fr.ch, fr.zn
		
		int newCh;
		int newZn;
		
		newZn = zn * fr.zn;
		newCh = ch*fr.zn + fr.ch*zn;
		
		Fraction newFr = new Fraction(newCh, newZn);
		
		
		return newFr;
	}

}
