package Helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import BeanPackage.Being;
import BeanPackage.Student;
import BeanPackage.EducationDetails.DegreeTypeEnum;

public class Java8Helper {
	
	public static void execute() {
		java8Example();
		
		duplicateExample();
		
		optionalExample();
		
		cityMapExample();
	}
	
	private static void java8Example() {
		
		
		// Functional Interface with lambda function
		Being horse = () -> System.out.println("Print all for horse");
		Being dog = () -> {
			String text = "print all for dog";
			System.out.println(text);
		};
		
		//Example when you need to pass a parameter in an abstract method
		//Being horse = (String abc) -> System.out.println("Print all for horse::" +abc);
		
		horse.printAll();
		dog.printAll();
		
	}
	
	private static void lambdaWithList() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(9);
		numbers.add(4);
		numbers.add(5);
		numbers.add(3);
		numbers.add(11);
		numbers.add(12);
		numbers.add(2);
		numbers.add(14);
		numbers.add(17);
		numbers.add(16);
		
		//without lambda
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
		//with lambda
		numbers.forEach(System.out ::println);
		
		numbers.forEach(number -> System.out.println(number));
		
	}
	
	private static void streamsExample() {
		
		List<Student> studentList = new ArrayList<>();
		
		Student s1 = new Student();
		s1.firstName = "Aseem";
		s1.studentId = 1;
		
		Student s2 = new Student();
		s2.firstName = "Aseem2";
		s2.studentId = 2;
		
		studentList.add(s1);
		studentList.add(s2);
		
		List<Integer> studentIdList = studentList
		.stream()
		.map(student -> student.studentId)
		.collect(Collectors.toList());
		
		List<Student> filteredStudentList = new ArrayList<>();
		
		studentList
		.stream()
		.filter(student -> student.studentId<50)
		.filter(student -> student.hasLaptop)
		.forEach(student -> filteredStudentList.add(student));
		
		
		
		List<Student> filteredStudentList2 = studentList
		.stream()
		.filter(student -> student.studentId<50)
		.filter(student -> student.hasLaptop)
		.collect(Collectors.toList());
		
		boolean incorrectCityDataPresent =  studentList
		.stream()
		.anyMatch(student -> null==student.city);
		
		
		List<DegreeTypeEnum> degreeTypeList = studentList
		.stream()
		.filter(student -> null!=student.eduDetails)
		.filter(student -> null!=student.eduDetails.degreeType)
		.map(student -> student.eduDetails.degreeType)
		.collect(Collectors.toList());
		
		studentList
		.stream()
		.collect(Collectors.toMap(Student:: getName, Student :: getName));
		
	}
	
	private static void duplicateExample() {
		List<String> degreeList = new ArrayList<>();
		degreeList.add("M");
		degreeList.add("B");
		degreeList.add("M");
		degreeList.add("B");
		System.out.println();
		System.out.print("Duplicate List:: ");
		degreeList.forEach(s-> System.out.print(s+','));
		
		List<String> filteredDegreeList = new ArrayList<>();
		
		for(String degree : degreeList) {
			if(!filteredDegreeList.contains(degree)) {
				filteredDegreeList.add(degree);
			}
		}
		
		System.out.println();
		System.out.print("Filtered List:: ");
		filteredDegreeList.forEach(s-> System.out.print(s+','));
		
		System.out.println();
		System.out.print("Filtered List with Java 8:: ");
		
		degreeList
		.stream()
		.distinct()
		.forEach(s-> System.out.print(s+','));
		
		/*
		 * degreeList .stream() .distinct() .forEach(s-> { System.out.print(s+',');
		 * System.out.print(s+','); System.out.print(s+','); });
		 */
		
		degreeList = degreeList
		.stream()
		.distinct()
		.collect(Collectors.toList());
		
		
		
		degreeList.removeIf(degree -> degree=="M");
		
	}
	
	private static void optionalExample() {
		List<Student> studentList = new ArrayList<>();
		
		Student s1 = new Student();
		s1.firstName = "Aseem";
		s1.studentId = 1;
		
		Student s2 = new Student();
		s2.firstName = "Aseem2";
		s2.studentId = 2;
		
		studentList.add(s1);
		studentList.add(s2);
		
		Student foundStudent = null;
		
		foundStudent = studentList
		.stream()
		.filter(student -> student.studentId==2)
		.collect(Collectors.toList())
		.get(0);
		
		Optional<Student> foundStudentOptional = studentList
				.stream()
				.filter(student -> student.studentId==2)
				.findFirst();
		
		if(foundStudentOptional.isPresent()) {
			foundStudent = foundStudentOptional.get();
		}
		System.out.println();
		System.out.println("Found Student with Name:: "+ foundStudent.firstName);
		
		
		
		/*
		 * Optional<Student> studentListOptional = studentList .stream() .filter(student
		 * -> student.studentId==50) .findFirst();
		 * 
		 * //Check if Present if(studentListOptional.isPresent()) {
		 * System.out.println(studentListOptional.get().studentId); }
		 */
		
		
		
	}
	
	private static void cityMapExample() {
		List<Student> studentList = new ArrayList<>();
		Student s0= new Student();
		s0.studentId= 001;
		s0.city="irving";
		
		Student s1= new Student();
		s1.studentId= 002;
		s1.city="irving";
		
		Student s2= new Student();
		s2.studentId= 003;
		s2.city="dallas";
		
		Student s3= new Student();
		s3.studentId= 004;
		s3.city="dallas";
		
		Student s4= new Student();
		s4.studentId= 004;
		s4.city="plano";
		
		Student s5= new Student();
		s5.studentId= 005;
		s5.city="plano";
		
		studentList.add(s0);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		List<String> cityList = studentList
		.stream()
		.map(student -> student.city)
		.distinct()
		.collect(Collectors.toList());
		
		Map<String, List<Student>> studentMap = new HashMap<>();
		
		cityList.forEach(city -> {
			studentMap.put(
						city, 
						studentList
						.stream()
						.filter(student -> city== student.city)
						.collect(Collectors.toList())
					);
		});
		
		studentMap.forEach((key, value) -> {
			System.out.println("For City: "+ key );
			System.out.println("these are the studentIDs: ");
			value.forEach(student -> {
				System.out.print(student.studentId + ",");
			});
			System.out.println();
		});
		
		Student newStudent = new Student();
		newStudent.city="Mckinney";
		newStudent.studentId=101;
		updateData(studentList, studentMap, newStudent );
	}
	
	private static void updateData(
			List<Student> studentList,
			Map<String, List<Student>> studentsMap,
			Student newStudent) {
		
		System.out.println();
		System.out.println("************* UpdateData *********************");
		boolean isStudentPresent = studentList
		.stream()
		.filter(s -> s.city.equals(newStudent.city))
		.filter(s-> s.firstName.equals(newStudent.firstName))
		.filter(s -> s.lastName.equals(newStudent.lastName))
		.filter(s -> s.studentId ==newStudent.studentId)
		.findFirst()
		.isPresent();
		
		if(!isStudentPresent) {
			studentList.add(newStudent);
			
			if(studentsMap.containsKey(newStudent.city)) {
				studentsMap.get(newStudent.city).add(newStudent);
			} else {
				List<Student> newStudentList = new ArrayList<>();
				newStudentList.add(newStudent);
				studentsMap.put(newStudent.city, newStudentList );
			}
			
			studentsMap.forEach((key, value) -> {
				System.out.println("For City: "+ key );
				System.out.println("these are the studentIDs: ");
				value.forEach(student -> {
					System.out.print(student.studentId + ",");
				});
				System.out.println();
			});
		} else {
			System.out.println("Student already exist.");
		}
	}

}
