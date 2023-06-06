package question1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
    private List<Student> students;
    
    public Department(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getStudents() {
        return students;
    }
}
