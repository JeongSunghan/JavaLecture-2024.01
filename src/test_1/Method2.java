package test_1;

public class Method2 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				sum += i;
			}
			System.out.println("2부터 100까지 소수의 합 = " + sum);
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