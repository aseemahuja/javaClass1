package InterfaceExamplePackage;

import BeanPackage.Student;

public class ExampleInterfaceStart {
	
	public static void execute() {
		InterfaceHelper helper = new InterfaceHelper();
		StudentHelper studentHelper = new StudentHelper();
		Student student = new Student();
		student.firstName = "studentFirst1";
		student.lastName = "studentlast1";
		student.studentId = 1;
		student.hasLaptop = true;
		studentHelper.setS(student );
		helper.getAndPrint(studentHelper);
		
		Student student2 = new Student();
		student2.firstName = "studentFirst2";
		student2.lastName = "studentlast2";
		student2.studentId = 2;
		student2.hasLaptop = true;
		studentHelper.setS(student2 );
		helper.getAndPrint(studentHelper);
		
		
		
		
		helper.getAndPrint(new TeacherHelper());
	}

}
