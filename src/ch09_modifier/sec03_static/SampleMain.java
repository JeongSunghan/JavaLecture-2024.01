package ch09_modifier.sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		
		//인스턴스 필드
		Sample sample = new Sample();
		System.out.println(sample.intstanceField);
		sample.instanceMethod();
		
		//스태틱 필드, 메소드 사용
		System.out.println(Sample.STATIC_FIELD);
		sample.staticMethod();
	}

}
