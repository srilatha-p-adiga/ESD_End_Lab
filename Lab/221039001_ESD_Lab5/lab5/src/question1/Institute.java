package question1;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	private String name;
    private List<Department> departments;
    
    public Institute(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }
    
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    public int getTotalStudents() {
        int count = 0;
        for(Department department : departments) 
        	count += department.getStudents().size();
        return count;
    }
}
