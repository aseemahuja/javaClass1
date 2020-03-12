package BeanPackage;

public class Student extends Person{
	public int studentId;
	public EducationDetails eduDetails;
	
	@Override
	public String toString() {
		this.category = "category";
		return this.studentId+this.firstName+this.lastName;
	}
	
	@Override
	public void print() {
		System.out.println("In class Student.");
	}
	
	@Override
	public void printAll() {
		System.out.println("In class Student. print All");
	}

}
