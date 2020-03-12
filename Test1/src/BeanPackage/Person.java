package BeanPackage;

public class Person implements Being{   // extends BeingAbstract
	
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String country;
	public boolean hasLaptop;
	protected String category;
	
	public void print() {
		System.out.print("In class Person");
	}

	public void printAll() {
		System.out.print("In class Person -> printAll");
		
	}
	
	public String getName() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(this.firstName);
		strBuilder.append(" ");
		strBuilder.append(this.lastName);
		
		return strBuilder.toString();
	}

}
