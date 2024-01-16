package ch04_control;

public class Ex14_PerfectNumber {

	public static void main(String[] args) {		//void = return, value 가 없다.
		for (int i = 2; i <= 10000; i++) {
//			int divSum = 0;
//			for (int k = 1; k < i; k++) {
//				if(i % k == 0)
//					divSum += k;
//			}
			int divSum = divisorsSum(i);
			if (i == divSum)
				System.out.println(i);
		}
	}

	 static int divisorsSum(int num) {
		int divSum = 0;
		for (int i = 1; i < num; i++)
			if (num % i == 0)
				divSum += i;		
		return divSum;
		
	}
}
