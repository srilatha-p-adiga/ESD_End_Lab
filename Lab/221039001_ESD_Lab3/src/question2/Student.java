package question2;
import java.util.*;

public class Student extends Person {
	 private int numCourses ;
	 private String[] courses;
	 private int[] grades ;
	 
    public Student() {
    	numCourses=1;
    	courses = new String[5];
        grades = new int[5];
    }

   

    public  Student(String name, String address) {
        super(name,address);
        numCourses=0;
        courses = new String[5];
        grades = new int[5];
    }
    
    public String toString() {
        
    	 return "Student: " + super.toString();
    }

    public  void addCoursegrade(String course, int grade) {
    	courses[numCourses] = course;
      grades[numCourses] = grade;
        numCourses=numCourses+1;
    }

    public void printGrades() {
    	for (int i = 0; i < numCourses; ++i) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
         }
         System.out.println();
    }

    public double getAveragegrade() {
    	int sum = 0;
        for (int i = 0; i < numCourses; i++ ) {
           sum += grades[i];
        }
        return (double)sum/numCourses;
    }

  

}