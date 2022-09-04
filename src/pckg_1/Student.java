package pckg_1;

public class Student {
	
	
	int age;
	int rollno;

	public void display1 () {
		
		
		System.out.println("Welcome to Automation Class");
	}

public void display2 () {
		
		
		System.out.println("Automation is easy!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		
		s.display1();
		s.display2();
		s.age=64;
		s.rollno=50;
		
		System.out.println("Age is:" +s.age);
		System.out.println("Roll Number is:" +s.rollno);		
	}

}
