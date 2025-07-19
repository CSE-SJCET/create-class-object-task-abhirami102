package helloname;

class Student{
	String name;
	int rollnumber;
	char grade;
	
	public void dispayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollnumber);
		System.out.println("Grade:"+grade);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Abhirami";
		student1.rollnumber=4;
		student1.grade='A';
		student1.dispayDetails();
	}

}
