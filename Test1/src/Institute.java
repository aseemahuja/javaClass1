import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.sound.sampled.ReverbType;

import BeanPackage.Audi;
import BeanPackage.Being;
import BeanPackage.ClassRoom;
import BeanPackage.EducationDetails.DegreeTypeEnum;
import BeanPackage.Employee;
import BeanPackage.Ford;
import BeanPackage.Person;
import BeanPackage.Student;
import BeanPackage.Vehicle;
import ComparePackage.SortById;
import ComparePackage.SortByName;
import Helpers.ClassRoomHelper;
import Helpers.Java8Helper;
import InterfaceExamplePackage.ExampleInterfaceStart;

public class Institute {

	public static void main(String[] args) {
		ClassRoomExample classRoom = new ClassRoomExample();
		classRoom.createClassRoom();
		
		loops();
		hashmapExample();
		compareArayWithMap(1234);
		overloadingExample();
		overridingExample();
		sortingExample();
		interfaceExample();
		
		
		ClassRoomHelper helper = new ClassRoomHelper();
		ClassRoom javaClass = helper.prepareClass("Java", 5, 10, true);
		ClassRoom testingClass = helper.prepareClass("Testing", 7, 14, true);
		helper.addTeacher(
				"teacherFirstName",
				"teacherLastName",
				"teacherCity",
				"teacherState",
				true,
				001,
				javaClass);
		
		helper.addStudent(
				"s1FirstName",
				"s1LastName",
				"s1City",
				"s1State",
				true,
				101,
				javaClass);
		
		helper.printClass(javaClass);
		
		
		interfaceExample();
		
		Java8Helper.execute();
		
		ExampleInterfaceStart.execute();
		
		
		

	}
	
	private static void hashmapExample() {
		Map<Integer,String> mapValues = new HashMap<>();
		mapValues.put(5, "abcd");
		mapValues.put(8,"abcde");
		mapValues.put(5, "xyz");
		
		System.out.println();
		System.out.print("Print value at position 5 :: " + mapValues.get(5));
		
		for(Entry<Integer, String> entry :mapValues.entrySet()) {
			System.out.println();
			System.out.print("Map Key::"+entry.getKey() +" and value is:: " +entry.getValue());
		}
		
	}
	
	private static void compareArayWithMap(int studentId) {
		
		Student s1 = new Student();
		s1.firstName = "First1";
		s1.studentId = 1234;
		
		Student s2 = new Student();
		s2.firstName = "First2";
		s2.studentId = 9876;
		
		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(s1.studentId, s1);
		studentMap.put(s2.studentId, s2);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		
		for(Student student: studentList) {
			if(studentId == student.studentId) {
				System.out.println("Found the student using ArrayList.");
				break;
			}
		}
		
		if(null!=studentMap.get(studentId)) {
			System.out.println("Found the student using map.");
		}
		
	}
	
	private static void loops() {
		
		int[] arrayIntegers = {1,2,3,4,5,6,7,8,9,10}; 
		
		System.out.print("For loop before Java 1.5:: ");
		
		for(int i =0; i<arrayIntegers.length;i++) {
			if(arrayIntegers[i]>4) {
				System.out.print(arrayIntegers[i]+",");
			}
			
		}
		
		System.out.println();
		System.out.print("For loop after Java 1.5:: ");
		
		for(int i : arrayIntegers) {
			if(i>4) {
				System.out.print(i+",");
			}
		}
		
		System.out.println();
		System.out.print("While loop :: ");
		int i = 9;
		while(i< arrayIntegers.length-3) {
			if(arrayIntegers[i]>4) {
				System.out.print(arrayIntegers[i]+",");
			}
			i++;
		}
		
		System.out.println();
		System.out.print("Do While loop :: ");
		
		do {
			
			if(arrayIntegers[i]>4) {
				System.out.print(arrayIntegers[i]+",");
			}
			i++;
			
		} while (i<arrayIntegers.length-3);
		
		
	}
	
	public static void sortingExample() {
		List<Integer> numberList = new ArrayList<>();
		
		numberList.add(4);
		numberList.add(1);
		numberList.add(2);
		numberList.add(5);
		numberList.add(7);
		numberList.add(9);
		numberList.add(3);
		System.out.println();
		System.out.print("Unsorted List:: ");
		for(Integer num: numberList) {
			System.out.print(num + ", ");
		}
		
		Collections.sort(numberList);
		System.out.println();
		System.out.print("Sorted List:: ");
		for(Integer num: numberList) {
			System.out.print(num + ", ");
		}
		
		Collections.sort(numberList, Collections.reverseOrder());
		System.out.println();
		System.out.print("Sorted in reverse order List:: ");
		for(Integer num: numberList) {
			System.out.print(num + ", ");
		}
		
		List<Student> studentList = new ArrayList<>();
		Student s1 = new Student();
		s1.studentId = 2;
		s1.firstName = "ABCD";
		
		Student s2 = new Student();
		s2.studentId = 1;
		s2.firstName = "XYZ";
		
		studentList.add(s1);
		studentList.add(s2);
		
		Collections.sort(studentList, new SortById());
		System.out.println();
		System.out.print("Sorted based on ID Student List:: ");
		System.out.println();
		for(Student student: studentList) {
			System.out.println("ID::" + student.studentId + " Name::"+ student.firstName + ", ");
		}
		
		Collections.sort(studentList, new SortByName());
		System.out.println();
		System.out.print("Sorted based on Name Student List:: ");
		System.out.println();
		for(Student student: studentList) {
			System.out.println("ID::" + student.studentId + " Name::"+ student.firstName + ", ");
		}
		
		Collections.sort(studentList, Collections.reverseOrder(new SortById()));
		
		System.out.println();
		System.out.print("Reverse Sorted based on ID Student List:: ");
		System.out.println();
		for(Student student: studentList) {
			System.out.println("ID::" + student.studentId + " Name::"+ student.firstName + ", ");
		}

	}
	
	// Overloading

	public static void overloadingExample() {
		add(1,2);
		add(1,2,3);
		add(1,"thirdMethod");
	}
	
	public static void add(int a, int b) {
		int c= a+b;
		
		System.out.println("In Method: add(int a, int b) ");
		
	}
	
	public static void add(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("In Method: add(int a, int b, int c) ");
	}
	
	public static void add(int a, String b) {
		String c = a+b;
		System.out.println("In Method: add(int a, String b) ");
		
	}
	
	/*
	 * public int add(int a, int b) { return 0; }
	 */
	
	//Overriding
	public static void overridingExample() {
		Student s1 = new Student();
		s1.print();
		s1.printAll();
		
		Employee t1 = new Employee();
		t1.print();
		t1.printAll();
		
	}
	
	public static void interfaceExample() {
		
		accelerateVehicle(new Audi());
		accelerateVehicle(new Ford());
		
	}
	
	public static void accelerateVehicle (Vehicle vehicle) {
		vehicle.accelerate();
	}
	
	public static void brakeVehicle (Vehicle vehicle) {
		vehicle.brake();
	}
	
	

}
