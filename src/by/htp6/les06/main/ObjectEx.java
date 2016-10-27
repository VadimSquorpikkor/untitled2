package by.htp6.les06.main;

public class ObjectEx {

	public static void main(String[] args) {
		Object obj = null;
		
		Student s1 = new Student(null, 19);
		Student s2 = new Student(null, 19);
		
		if(s1.equals(s2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		// equals hashCode
		
		Class ref;
		
		ref = Student.class;
		
		
		Object obj2 = new Student("aaa", 23);
		
		
		Class ref2;
		ref2 = obj2.getClass();
		
		
		if(obj2.getClass() == Student.class){
			
		}
		
		if(obj2.getClass() == obj.getClass()){}
		

	}
}


class Student {
	// private int id;
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * public boolean equals(Object obj){ if( this == obj){ return true; }
	 * 
	 * if( null == obj){ return false; }
	 * 
	 * if( this.getClass() != obj.getClass()){ return false; }
	 * 
	 * Student st = (Student)obj;
	 * 
	 * if(age != st.age){ return false; }
	 * 
	 * if (name == null){ if (st.name == null){ return true; }else{ return
	 * false; }
	 * 
	 * }else{ return name.equals(st.name); }
	 * 
	 * }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
