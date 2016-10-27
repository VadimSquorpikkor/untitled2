package by.htp6.les05.main3;

public class Main {

	public static void main(String[] args) {
		CourseCreator creator = new BaseCourseCreator();

		Course course = creator.getCourse();
	}

}

class Course{}
class BaseCourse extends Course{}


class CourseCreator{
	
	
	public Course getCourse(){
		return new Course();
	}
	
}

class BaseCourseCreator extends CourseCreator{
	
	public BaseCourse getCourse(){
		return new BaseCourse();
	}
	
}