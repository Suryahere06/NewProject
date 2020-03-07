package NewProject1;

public class Student {
	
	String name;
	
	
	public Student(String name) {
		this.name=name;
		System.out.println("Name is: "+ name);
//
	}
	public Student() {
		
		this.name="unknown";
		System.out.println("No name is passed");

	}
	

	public static void main(String[] args) {
	  	
		
		Student s=new Student();
		Student s1=new Student("John");
		
		
		

	}

}
