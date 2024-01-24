package ch17_collection.part1_list.sec05_member;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	private static List<Member> list = new ArrayList<>();

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int age = 20 + (int) (Math.random() * 20);
			list.add(new Member(age, "이름" + i, Math.random() > 0.5 ? "남" : "여"));
		}
		for (Member m : list)
			System.out.println(m);
		System.out.println("============================================");

		// 나이가 30세 초과 인 멤버 리스트
		List<Member> mList = getMemberListAbove30();
		mList.forEach(x -> System.out.println(x));
		System.out.println("============================================");

		// 남성 멤버 리스트
		mList = getMemberListByGender("남");
		mList.forEach(x -> System.out.println(x));
		System.out.println("*******************************");

		// 새로운 멤버 추가
//		Member member = new Member(39, "제임스", "남");
//		insertMember(member);
//		list.forEach(x -> System.out.println(x));
//		System.out.println("*******************************");
		
		//멤버 삭제
		deleteMember("이름7");
		list.forEach(x -> System.out.println(x));
		System.out.println("===============================");
	}

	static List<Member> getMemberListAbove30() {
		List<Member> mList = new ArrayList<Member>();
		for (Member m : list) {
			if (m.getAge() > 30)
				mList.add(m);
		}
		return mList;
	}

	static List<Member> getMemberListByGender(String gender){
		List<Member> mList = new ArrayList<Member>();
			for (Member m: list) {
				if(m.getGender().equals(gender))
					mList.add(m);	
			}
			return mList;
					
	}
	static void insertMember(Member member) {
		list.add(member);
	}
	
	static void deleteMember(String name) {
		Member member = null;
		for (Member m: list) {
			if(m.getName().equals(name)); {
				member = m;
				break;
			}
		}
		list.remove(member);
		
	}
}
