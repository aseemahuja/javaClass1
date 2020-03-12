package BeanPackage;

public class Ford implements Vehicle{
	
	@Override
	public void accelerate() {
		System.out.println("This is Ford Accelerate");
		System.out.println("This is Ford1 Accelerate");
		System.out.println("This is Ford2 Accelerate");
		System.out.println("This is Ford3 Accelerate");
		
	}

	@Override
	public void brake() {
		System.out.println("This is Ford brake");
		
	}

}
