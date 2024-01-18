package praticeExam_Book;

public class Q3_pratice {

	public static void main(String[] args) {
		for (int i = 0; ; i++) {
			if (i == 1) {
				continue;				
			}
			if (i == 3) {
				continue;
			}
			if (i == 5) {
				continue;
			}
			if (i == 7) {
				continue;
			}
			if (i == 9) {
				continue;
			}
			if (i == 11) {
				break;
			}
			System.out.println(i);
			
			
			//다른방법 1
			for (int n = 0; ; n++) {
				if (n > 10)
					break;
				if(n % 2 == 1)
					continue;
				System.out.println(n);
				
			//다른방법 2
			for (int k = 0; k <= 10; k +=2)
				System.out.println(k);
				
			}
				
		}
		
	}

}
