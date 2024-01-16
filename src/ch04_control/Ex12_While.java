package ch04_control;

public class Ex12_While {

	public static void main(String[] args) {
		//주사위 눈의 합이 15이하면 계속 주사위를 굴리고, 초과하면 탈출
		int diceSum = 0;
			while (diceSum <= 15) {
				int dice = 1 + (int) (6 * Math.random());
				System.out.print(dice + " ");
				diceSum += dice;
			}
			System.out.println();	System.out.println(diceSum);
		
			//의도적으로 무한루프를 만들고 탈출 조건을 루프 안에서 만들어 준다
			diceSum = 0;
			while (true) {				//while문은 (괄호)안에 빈칸이 없어야함
				int dice = 1 + (int) (6 * Math.random());
				System.out.println(dice + " ");
				diceSum += dice;
				if (diceSum > 15)
					break;
				
			}
			System.out.println();	System.out.println(diceSum);
			
			// do-while, 한번은 무조건 수행
			diceSum = 0;
			do {
				int dice = 1 + (int) (6 * Math.random());
				System.out.println(dice + " ");
				diceSum += dice;
			}while (diceSum <= 15);
			System.out.println();	System.out.println(diceSum);
	}

}
