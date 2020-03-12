package BeanPackage;

public class Employee extends Person{
	
	enum categoryEnum {
		EMPLOYEE,
		STUDENT
	}
	
	public Employee() {
		System.out.println("Created Constructor for Empoyee.");
		this.category = "Employee";
		
	}
	
	public Employee(String category) {
		System.out.println("Created parametrized Constructor for Empoyee.");
		this.category = category;
		
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
	
	public String getCategory() {
		return category;
		
	}
	
	public int empId;
	
	@Override
	public void print() {
		System.out.println("In class Employee.");
	}

}
