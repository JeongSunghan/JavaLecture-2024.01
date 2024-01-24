package ch14_exception;

public class Ex03_UncheckedSolution {

	public static void main(String[] args) {
		int a = 3, b = 0;
		if (b == 0)
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
		else
			System.out.println(a / b);
		
		int[] intArray = new int[3];
		int index = 3;
		if (index >= intArray.length)
			System.out.println("인덱스 범위를 확인하세요.");
		else
			System.out.println(intArray[index]);
		
		String str = null;
		if (str != null)
			System.out.println(str.length());
		
		str = "100원";
		int value = Integer.parseInt(str.replace("원", ""));
		System.out.println(value);
				
		Animal2 a1 = new Cat2();
		Animal2 a2 = new Dog2();
		Cat2 cat = null;
		if (a1 instanceof Cat2)
			cat = (Cat2) a1;
		if (a2 instanceof Cat2)
			cat = (Cat2) a2;

		System.out.println("프로그램의 마지막입니다.");
	}
	
}

class Animal2 { }
class Dog2 extends Animal2 { }
class Cat2 extends Animal2 { }
