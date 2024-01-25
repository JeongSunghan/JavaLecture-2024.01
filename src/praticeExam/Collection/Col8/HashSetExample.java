package praticeExam.Collection.Col8;

import java.util.HashSet;
import java.util.Iterator;		//Hashset과 arraylist를 반복하는데 사용해줄 수 있다
import java.util.Set;

import ch10_oop.sec02_constructor.Student;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));		//학번이 같으므로 저장x
		
		Iterator<Student> iterator = set.iterator();
			while(iterator.hasNext()) {
				Student student = iterator.next();
				System.out.println(student.studentNum + ":" + student.name);
			}
	}	

}
