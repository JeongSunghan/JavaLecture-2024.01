package test_1;

public class Control2 {

	public static void main(String[] args) {
		int div2 = 0;
		for (int j = 1; j <= 20; j++) { // 마찬가지로 i+=2 증감식으로 가능
			if (j % 2 == 1)
				div2 += j * j;
			System.out.println("1에서 20까지 홀수 제곱의 합은= " + div2);
		}

	}
}
