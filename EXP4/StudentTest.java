class Student {
	String name;
	int roll_no;
}
public class StudentTest{
	public static void main(String[]args) {
		System.out.println("LAKSHAY YADAV , 24CSU112");
		Student s1 = new Student();

		 s1.name = "john";
		 s1.roll_no = 2 ;

		 System.out.println("NEME : " +s1.name);
		 System.out.println("ROLL NUMBER : " +s1.roll_no);

	}
}