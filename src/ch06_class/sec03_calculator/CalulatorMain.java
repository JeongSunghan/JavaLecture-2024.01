package ch06_class.sec03_calculator;

public class CalulatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int x = 3, y = 4;
		System.out.println(" 3 + 4 = " + calc.add(x, y));
		System.out.println(" 3 - 4 = " + calc.sub(x, y));
		System.out.println(" 3 * 4 = " + calc.mul(x, y));
		System.out.println(" 3 / 4 = " + calc.div(x, y));
		
		calc.print(30,40);
		
		System.out.println("3.1 + 4.5 = " + calc.add(3.1, 4.5));
	}

}
