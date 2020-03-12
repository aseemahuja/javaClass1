package ComparePackage;

import java.util.Comparator;

import BeanPackage.Student;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.firstName.compareTo(o2.firstName);
	}

}
