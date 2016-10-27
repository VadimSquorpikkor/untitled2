package by.htp6.les04.array;

public class Array2 {

	public static void main(String[] args) {
		int[] a = new int[]{4,5,6,7,8};
		int[] a1 = {4,5,6,7,8};
		Integer i = 90;
		
		int x = 6;
		Student st = new Student("");
		
		Student[] mas = new Student[3];
		
		mas[0] = new Student("Vasya");
		mas[0].getName();
		
		Student[] mas3 = {new Student("aa"), new Student("sdf")};

		int[] b = a.clone();
	}

}

class Student{
	String name;
	
	Student(String _name){
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}