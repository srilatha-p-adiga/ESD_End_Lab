package question2;

public class testPerson {

	public static void main(String[] args) {
		Person p=new Person("Srilatha","Udupi");
		assert(p.getName()=="Aditya" && p.getAddress()=="Udupi");
		p.setAddress("Saligrama");
	    assert(p.getAddress()=="Saligrama");
	    
	  
	      Student s1 = new Student("Sripriya", "Parampalli");
	      assert(s1.getName()=="Sripriya" && s1.getAddress()=="Parampalli");
	      s1.addCoursegrade("DSP", 60);
	      s1.addCoursegrade("DD", 68);
	      s1.printGrades();
	      assert( s1.getAveragegrade()==64);
	      
	      
	      Teacher t1 = new Teacher("Pallavi", "Kota");
	      System.out.println(t1);
	      String[] courses = {"DSP", "DD"};
	      t1.addCourse("VP");
	      t1.removeCourse("DSP");
	}

}
