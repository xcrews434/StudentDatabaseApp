package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private String studentID;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	
	//Constructor prompt user to enter student's name and year.
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student classification: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
			
	}
	
	//Generate an ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
		
		
	}
	
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("0")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { 
				break; 
			}
			} while (1 != 0);
			
		//System.out.println("Enroll ID: " + courses);
		
	}
	
	//View balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nStudentID: " + studentID +
				"\nClassification: " + gradeYear +
				"\nCourses Enrolled: " + courses +
				"\nTuition Balance: $" + tuitionBalance;
	}
	

}
