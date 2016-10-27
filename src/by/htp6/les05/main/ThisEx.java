package by.htp6.les05.main;

public class ThisEx {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.getTitle();
		//getTitlt(b1);
		
		Book b2 = new Book("C++", 400);
		
		b1.getTitle();
		//getTitlt(b1);
		
		b2.getTitle();
		//getTitle(b2);
	}

}


class Book{
	private String title;
	private int price;
	private String author;
	
	Book(){
		this("stub", 0);
		
	}
		
	Book(String _title, int _price){
		this.title = _title;
		this.price= _price;
	}
	
	public void init(String _title, int _price){
		this.title = _title;
		this.price= _price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
/*	
 * 
 *  public String getTitle(Book this) {
		return this.title;
	}

*/	
	//this - это ссылка на объект, кторые вызвал метод; или this - это ссылка на самого себя


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
