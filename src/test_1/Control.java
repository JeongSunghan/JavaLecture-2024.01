package test_1;

public class Control {

	public static void main(String[] args) {
		int div = 0;
		for (int i = 1; i <= 100; i++) { // 혹은 증감식에 i += 2으로 해도 가능
			//i를 100까지 증감시키는 반복문
			if (i % 3 == 0)
				//i가 3으로 나누어떨어지면 
				div += i;
			//div = div + i 
			System.out.println("3의 배수의 합은 = " + div);
//			System.out.println("i = " + i + ", div = " + div);
		}
	}
}
