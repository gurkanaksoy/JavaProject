package Homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)","2 ay sürecek Yazýlým Geliþtirici...","Engin Demirog",0);
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)","2 ay sürecek Yazýlým Geliþtirici...","Engin Demirog",0);
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","PYTHON, JAVA, C# gibi tüm program..","Engin Demirog",0);
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			
			//System.out.println(course.courseName);
			
			courseManager.addCourse(course);
			courseManager.listCourses(courses);
		}
	}

}
