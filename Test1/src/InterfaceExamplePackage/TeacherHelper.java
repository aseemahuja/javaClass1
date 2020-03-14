package InterfaceExamplePackage;

import BeanPackage.Employee;

public class TeacherHelper implements InstituteEntity{

	@Override
	public Object getData() {
		Employee teacher = new Employee();
		teacher.firstName = "teacherFirst";
		teacher.lastName = "teacherLast";
		teacher.empId = 1111;
		teacher.hasLaptop = true;
		return teacher;
	}

	@Override
	public void printData(Object o) {
		Employee t = (Employee)o;
		System.out.println();
		System.out.println("******* Teacher Data ********");
		System.out.println("Teacher Name::" + t.firstName+t.lastName);
		System.out.println("Teacher ID:: " + t.empId);
		
	}

}
