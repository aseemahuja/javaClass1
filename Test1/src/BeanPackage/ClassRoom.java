package BeanPackage;

import java.util.List;

public class ClassRoom {
	
	int chairs;
	int tables;
	Employee teacher;
	List<Student> studentList;
	boolean hasProjector;
	String name;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getChairs() {
		return chairs;
	}
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	public int getTables() {
		return tables;
	}
	public void setTables(int tables) {
		this.tables = tables;
	}
	public Employee getTeacher() {
		return teacher;
	}
	public void setTeacher(Employee teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public boolean isHasProjector() {
		return hasProjector;
	}
	public void setHasProjector(boolean hasProjector) {
		this.hasProjector = hasProjector;
	}

}
