package test_1;

public class Method1 {
	public static void main(String[] args) {
		int numCheck = 2;		//숫자 아무거나 입력
		boolean isPrime = isPrime(numCheck);

		if (isPrime) {
			System.out.println(numCheck + "는 소수입니다.");
		} else {
			System.out.println(numCheck + "는 소수가 아닙니다.");
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
