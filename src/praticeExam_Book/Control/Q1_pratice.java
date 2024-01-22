package praticeExam_Book.Control;

public class Q1_pratice {

	public static void main(String[] args) {
		int score = 72;
		
			if (score >= 80 && score < 90) {
				System.out.println("B학점");
			}
			else if(score >= 90) {
				System.out.println("A학점");
			}
			else if(score >= 70 && score < 80) {
				System.out.println("C학점");
			}
			else if(score < 70) {
				System.out.println("D학점");
			}
		
			
//			강사님 방법
			if (score >= 90)
				System.out.println("A학점");
			else if(score >= 80)
				System.out.println("B학점");
			else if(score >= 70)
				System.out.println("C학점");
			else 
				System.out.println("D학점");
	}

}
