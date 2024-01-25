package praticeExam.Collection.Col8;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student m = (Student) obj;
			return m.studentNum == this.studentNum;
		}else {
			return false;
		}
		

	}
}
