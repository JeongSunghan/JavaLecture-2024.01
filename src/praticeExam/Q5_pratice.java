package praticeExam;

public class Q5_pratice {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {		// i = 1, 2, 3, 4 / 5면 다음
			
			
			for(int j = 0; j < 3; j++) {	// j = 1,2 / 3이면 다음
				if (i == 2) {	// i가 2일 떄, 반복문 다시 시작 -> 2로 시작하면 3,4
					continue;
				}
				if(j == 1) {		//j가 1일 때, 반복문 종료 -> 0,
					break;
				}
				
				
				
				System.out.println(i+", "+j);
				//A는 4번
				// i = 0/1/3/4   
				// j = 0/0/0/0   
			}
		}

	}

}