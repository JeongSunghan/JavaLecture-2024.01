package ch17_collection.part2_set.sec02_member;

import java.util.Objects;

public class Member {
	private int age;
	private String name;

	
	
	public Member() {}
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	
	//HastSet, HashMap 등에 사용하려면 hashCode(), equals() 메소드를 재정의하여야함
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return m.getAge() == this.age && m.getName().equals(this.name);
		}else
			return false;
	}
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
