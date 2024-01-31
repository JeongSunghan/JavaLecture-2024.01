package test_2;

import java.util.ArrayList;
import test_2.Member;

public class MemberMain {

	public static void main(String[] args) {
	        ArrayList<Member> memberList = getMemberList();

	        for (Member member : memberList) {
	            member.setTel("010-1234-5678"); // 전화번호 변경
	            member.Member(); // 변경된 정보 출력
	        }
	    }

	    private static ArrayList<Member> getMemberList() {
	        ArrayList<Member> members = new ArrayList<>();

	        Member james = new Member(1, "James", 2000, "010-1111-2222");
	        Member maria = new Member(2, "Maria", 2002, "010-3333-4444");

	        members.add(james);
	        members.add(maria);

	        return members;
	    }
	}




