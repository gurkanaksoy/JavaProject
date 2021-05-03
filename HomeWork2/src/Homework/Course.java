package Homework;

public class Course {
	
		int courseID;
		String courseName;
		String courseDetail;
		String courseInstructor;
		double coursePrice;
		
	public Course(int courseID,String courseName,String courseDetail,String courseInstructor,double coursePrice) {
		this();
		this.courseID = courseID;
		this.courseName= courseName;
		this.courseDetail= courseDetail;
		this.courseInstructor= courseInstructor;
		this.coursePrice= coursePrice;
		
	}

	public Course() {
		//System.out.println("Kurs!!!");
	}


}
