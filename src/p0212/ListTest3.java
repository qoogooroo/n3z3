package p0212;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("김이름");
		student1.setGrade(2);
		student1.setSchoolName("고등고등학교");
		Student student2 = new Student();
		student2.setName("이이름");
		student2.setGrade(1);
		student2.setSchoolName("중등고등학교");
		Student student3 = new Student();
		student3.setName("안이름");
		student3.setGrade(3);
		student3.setSchoolName("고등고등학교");
		Student student4 = new Student();
		student4.setName("양일음");
		student4.setGrade(2);
		student4.setSchoolName("초등고등학교");
		Student student5 = new Student();
		student5.setName("박일음");
		student5.setGrade(1);
		student5.setSchoolName("중등고등학교");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		for(Student s:students) {
			if(s.getName().startsWith("이름") || s.getSchoolName().startsWith("중등")) {	
				//name.startsWith("~")
				//name.substring(0,1).equals("~")
				
				System.out.println(s);
			}
		}
		
	}
}
