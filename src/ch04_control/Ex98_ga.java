package ch04_control;

public class Ex98_ga {
	public static void main(String[] args) {
		int lifeSum = 0;
		String st1 = "번 패는걸 시작합니다.";
		String st2 = "계훈이가 살아있나 확인합니다.";
			while (true) {
				int life = 1 + (int) (6 * Math.random());
				System.out.println("계훈이를 " + life + st1);
				lifeSum += life;
				if (lifeSum > 15)
					break;
				System.out.println(st2);
				System.out.println("");
				System.out.println("살이있기에 다시 진행합니다.");
				System.out.println("");
			}
			System.out.println("계훈이가 사망했기에 패는걸 멈춥니다.");
	}
}
