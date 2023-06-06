package question1;

public class Student {
	 private String name;
	 private int id;
	 private String departmentName;
	    
	 public Student(String name, int id, String departmentName) {
	     this.name = name;
	     this.id = id;
	     this.departmentName = departmentName;
	  }
	    public String getName() {
	        return name;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getDepartmentName() {
	        return departmentName;
	    }
}
