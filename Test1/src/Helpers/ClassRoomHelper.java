package Helpers;

import java.util.ArrayList;
import java.util.List;

import BeanPackage.ClassRoom;
import BeanPackage.Employee;
import BeanPackage.Student;

public class ClassRoomHelper {
	
	public ClassRoom prepareClass(String name, int tables, int chairs, boolean hasProjector) {
		
		ClassRoom classRoom = new ClassRoom();
		classRoom.setName(name);
		classRoom.setTables(tables);
		classRoom.setChairs(chairs);
		classRoom.setHasProjector(hasProjector);
		
		return classRoom;
		
	}

	public void addTeacher(
			String firstName, 
			String lastName, 
			String city, 
			String state, 
			boolean hasLaptop,
			int empId,
			ClassRoom classRoom) {
		
		Employee teacher = new Employee();
		teacher.firstName = firstName;
		teacher.lastName = lastName;
		teacher.empId = empId;
		teacher.city = city;
		teacher.hasLaptop = hasLaptop;
		teacher.state = state;
		
		classRoom.setTeacher(teacher);
		
		
	}
	
	public void addStudent(String FirstName,
			String lastname,
			String city,
			String state,
			boolean hasLaptop,
			int rollNumber,
			ClassRoom classRoom){
		
		Student student = new Student();
		student.firstName = FirstName;
		student.hasLaptop = hasLaptop;
		student.lastName = lastname;
		student.city= city;
		student.state = state;
		
		List<Student> studentList = classRoom.getStudentList();
		
		if(null== studentList) {
			studentList = new ArrayList<>();
		}
		
		studentList.add(student);
		
		classRoom.setStudentList(studentList);
		
	}
	
	
	
	public void printClass(ClassRoom classRoom) {
		System.out.println();
		System.out.println(".............This is " + classRoom.getName() + "class.....................");
		if(classRoom.isHasProjector()) {
			System.out.println("Projector is preset.");
		} else {
			System.out.println("Projector is not present.");
		}
		
		System.out.println("Teacher Name is:: "+ classRoom.getTeacher().firstName + " " + classRoom.getTeacher().lastName);
	}
	

}
