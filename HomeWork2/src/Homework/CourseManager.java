package Homework;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.courseName+" Kursu baþarýyla kütüphaneye eklenmiþtir...");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+" Kursu baþarýyla kütüphaneden silindi...");
	}
	
	public void listCourses(Course[] course) {
		System.out.println("Kurs listelendi...");
	}
	
	
}
