package impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SortingExample {
	
	public List<Student> getList(){
		List<Student> studentList = new LinkedList<Student>();
		
		Student s =new Student(1, "Sumit", 88.86);
		Student s1 =new Student(2, "Sandip", 91.89);
		Student s2 =new Student(3, "Amit", 67.23);		
		studentList.add(s);
		studentList.add(s1);
		studentList.add(s2);
		
		return studentList;
	}

	public static void main(String[] args) {
		SortingExample s =new SortingExample();
		
		Comparator<Student> nameComarator = (o1,o2)->{
			return  o1.getName().compareTo(o2.getName());
		};
		
		List<Student> studentList = s.getList();
		System.out.println("Original List"+studentList);

		Collections.sort(studentList,nameComarator);
		System.out.println("After Sorting List"+studentList);
		
		Iterator<Student> studentIterator = studentList.iterator();
		
		List<String> names = new LinkedList<String>();
		
		studentList.forEach( st->{
			System.out.println("Name is "+st.getName());
			names.add(st.getName());
			
		});
		System.out.println("Names are "+names);
		System.out.println("Name as per enhanced for loop");
		for(Student stu:studentList){
			System.out.println(stu.getId());
		}
		
		
		
	}

}
