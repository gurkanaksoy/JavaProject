package Homework;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.courseName+" Kursu ba�ar�yla k�t�phaneye eklenmi�tir...");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+" Kursu ba�ar�yla k�t�phaneden silindi...");
	}
	
	public void listCourses(Course[] course) {
		System.out.println("Kurs listelendi...");
	}
	
	
}
