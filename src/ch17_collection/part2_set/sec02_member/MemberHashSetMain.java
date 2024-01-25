package ch17_collection.part2_set.sec02_member;

import java.util.HashSet;
import java.util.Set;

public class MemberHashSetMain {

	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		Member m1 = new Member(21, "james");
		Member m2 = new Member(20, "maria");
		Member m3 = new Member(21, "james");
		set.add(m1);
		set.add(m2);
		set.add(m3);
		System.out.println(set);
		System.out.println(m1.hashCode()+ ", " + m2.hashCode() + ", " + m3.hashCode());
		
		
		
		
	}
	
	/* Object obj = new Animal();
	  	Animal animal = new Animal();
	  	Cat cat = new Cat();
	  	Dog dog = new Dog();
	  
	 * 다형성
	  	animal = new Cat();
	 	animal = new Dog();
	  
	 * 부모타입을 자식타입으로 변경
	  	if (animal instanceof Cat)
	 		cat = (Cat) animal;
	 
	  	if (obj instanceof Cat)
	  		cat = (Cat) obj;
	 
	 */

}
