package Homework;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println(course.courseName+" Kursu başarıyla kütüphaneye eklenmiştir...");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+" Kursu başarıyla kütüphaneden silindi...");
	}
	
	public void listCourses(Course[] course) {
		System.out.println("Kurs listelendi...");
	}
	
	
}
