package ch03_operation;

public class Ex01_Operation {

	public static void main(String[] args) {
		int i = 2, k = 3;
		double f = k / (double) i;
				System.out.printf("%d, %d, %d%n", k/i, i++, --k);		// 1.5, 2, 2
				System.out.printf("%.1f, %d, %d%n", f, i++, --k);		//1.5, 3, 1
				
				char c = '안';
				System.out.println(c == '안');	// ==은 primitive type 값 비교
				String s = new String("Hello");
				System.out.println(s == "Hello");		//참조형에서는 저장 위치가 같느냐를 물어보는 코드
				System.out.println(s.equals("Hello"));	//참조형의 올바른 방법
				
				System.out.println(i == k && k == 4);
				
				//성적이 70점 이상이면 합격, 그렇지 않으면 불합격
					int score = 40 + (int) (61 * Math.random());	//40~100까지
					char grade = score >= 70 ? '급' : '낙';
					System.out.printf("%d, %c%n", score, grade);
	}
/*
 * 가만히 두면 double에 할당이 됨.
 * 		3/4 = 0 / 0.75
 * 		3/2 = 1 / 1.5
 * 
 * 		논리식(short circuit)
 * 		; 논리식 1 && 논리식 2 = 논리식 1이 false면 답은 = false, 논리식 2는 계산안함
 * 		; 논리시1 || 논리식 2 = 논리식 1이 true 면, 논리식2를 더이상 계산안함		
 */
}
