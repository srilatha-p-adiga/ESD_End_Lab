package question1;

public class TestInstitute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Srilatha", 1, "ES");
        Student s2 = new Student("Manaswi", 2, "ES");
        Student s3 = new Student("Arjun", 3, "ES");
        Student s4 = new Student("Ananth", 4, "ES");
        Student s5 = new Student("Varsha", 5, "VLSI");
        Student s6 = new Student("Prakyat", 6, "VLSI");
        Student s7 = new Student("Aneesh", 7, "VLSI");
        Student s8 = new Student("Akshay", 8, "VLSI");
        // Create department objects and add students
        Department esDepartment = new Department("ES");
        esDepartment.addStudent(s1);
        esDepartment.addStudent(s2);
        esDepartment.addStudent(s3);
        esDepartment.addStudent(s4);
        Department vlsiDepartment = new Department("VLSI");
        vlsiDepartment.addStudent(s5);
        vlsiDepartment.addStudent(s6);
        vlsiDepartment.addStudent(s7);
        vlsiDepartment.addStudent(s8);
        // Create institute object and add departments
        Institute msisInstitute = new Institute("MSIS");
        msisInstitute.addDepartment(esDepartment);
        msisInstitute.addDepartment(vlsiDepartment);
        // Test the getTotalStudents() method
        int totalStudents = msisInstitute.getTotalStudents();
        System.out.println("Total number of students at MSIS : " + totalStudents);
	}
}
