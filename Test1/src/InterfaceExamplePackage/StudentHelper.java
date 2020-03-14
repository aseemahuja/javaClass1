package InterfaceExamplePackage;

import BeanPackage.Student;

public class StudentHelper implements InstituteEntity{
	
	private Student s;
	
	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public Object getData() {
		return s;
	}

	@Override
	public void printData(Object o) {
		Student s = (Student)o; // Type Casting
		System.out.println();
		System.out.println("******* Student Data ********");
		System.out.println("Student Name::" + s.firstName+s.lastName);
		System.out.println("Student ID:: " + s.studentId);
		
	}

}
