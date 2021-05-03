package Homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)","2 ay s�recek Yaz�l�m Geli�tirici...","Engin Demirog",0);
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)","2 ay s�recek Yaz�l�m Geli�tirici...","Engin Demirog",0);
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","PYTHON, JAVA, C# gibi t�m program..","Engin Demirog",0);
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			
			//System.out.println(course.courseName);
			
			courseManager.addCourse(course);
			courseManager.listCourses(courses);
		}
	}

}
