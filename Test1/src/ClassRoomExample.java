import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import BeanPackage.*;
import BeanPackage.EducationDetails.DegreeTypeEnum;

public class ClassRoomExample {
	private static String variable1;

	public void createClassRoom() {
		variable1 = "";
		// Variables
		int chairs =8;
		int tables=3;
		int monitors =3;
		boolean isBoardPresent = true;
		boolean isProjectorPresent = true;
		String className = "Java Class 1";
		double classStandardPecentage = 0.00;
		
		
		
		List<Student> studentList = getStudentList();
		
		
		
		Employee teacher = new Employee();
		System.out.println("New Employee object created." );
		teacher.firstName = "TeacherFirst";
		teacher.lastName = "TeacherLast";
		teacher.city = "TeacherCity";
		teacher.state = "TeacherState";
		teacher.country = "TeacherCountry";
		teacher.hasLaptop = true;
		//teacher.setCategory("empoyee");
		
		System.out.println("Welcome to :" + className + " Class" );
		System.out.println("__________________________");
		System.out.println("No. Of Chairs:" + chairs );
		System.out.println("No. Of Tables:" + tables );
		System.out.println("No. Of Monitors:" + monitors );
		System.out.println("Is Board Present:" + isBoardPresent );
		System.out.println("Is projector Present:" + isProjectorPresent );
		System.out.println("Class Standard Percentage:" + classStandardPecentage );
		System.out.println();
		System.out.println();
		
		getStudentList(studentList);
		
		
		System.out.println();
		System.out.println();
		System.out.println("Teacher Name:" + teacher.firstName + " " + teacher.lastName );
		System.out.println("Teacher City:" + teacher.city );
		System.out.println("Teacher State:" + teacher.state );
		System.out.println("Teacher Country:" + teacher.country );
		System.out.println("Teacher has Laptop:" + teacher.hasLaptop );
		System.out.println("Teacher Category:" + teacher.getCategory() );
		
		Employee cook = new Employee("Cook");
		System.out.println("Cook Category:" + cook.getCategory() );
		
		
		List<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("print at this position:: "+ arrayList.get(7));
		
		
		//int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[5];
		array2[1] = 2;
		System.out.println("print at this Array position:: "+ array2[4]);
		
	}
	
	private static List<Student> getStudentList(){
		
		Student students = new Student();
		students.firstName = "StudentFirst";
		students.lastName = "StudentLast";
		students.city = "StudentCity";
		students.state = "StudentState";
		students.country = "StudentCountry";
		students.hasLaptop = true;
		
		students.eduDetails = new EducationDetails();
		students.eduDetails.degree=  "Degree name";
		students.eduDetails.degreeType = DegreeTypeEnum.GRADUATE;
		
		Student students2 = new Student();
		students2.firstName = "StudentFirst2";
		students2.lastName = "StudentLast2";
		students2.city = "StudentCity2";
		students2.state = "StudentState2";
		students2.country = "StudentCountry2";
		students2.hasLaptop = true;
		
		students2.eduDetails = new EducationDetails();
		students2.eduDetails.degree=  "Degree name";
		students2.eduDetails.degreeType = DegreeTypeEnum.GRADUATE;
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(students);
		studentList.add(students2);
		
		System.out.println("prin Student 1:::::::::::::::::::::::: "+ students);
		
		return studentList;
		
	}
	
	private static void getStudentList(List<Student> studentList) {
		
		for(Student students: studentList) {
			
			System.out.println("Student Name:" + students.firstName + " " + students.lastName );
			System.out.println("Student City:" + students.city );
			System.out.println("Student State:" + students.state );
			System.out.println("Student Country:" + students.country );
			System.out.println("Student has Laptop:" + students.hasLaptop );
			System.out.println("Student Degree:" + students.eduDetails.degree );
			System.out.println("Student Degree Type:" + students.eduDetails.degreeType );
			System.out.println("Does Student has Degree:" + students.eduDetails.hasDegree() );
			System.out.println();
			System.out.println();
		}
		
	}
	
	
	
	

}
