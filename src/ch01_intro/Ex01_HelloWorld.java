package ch01_intro;

//class 이름은 대문자로(Ex01.~~) 시작
public class Ex01_HelloWorld {
		
	/**
	 * document 주석 - API document만들 때 사용
	 * @param args
	 */
	
	//method 이름, main은 소문자로 시작
	public static void main(String[] args) {		//자바의 시작점 = main		
		//public = 접근제한자 
		System.out.println("Hello World!!!");		//인라인 주석(문장 끝에는 반드시 세미콜론=;을 붙여야 함)
		System.out.println("안녕하세요?"+"여러분!!!");	//하나의 문자열만 올 수 있으며 2개 이상일시 +		
													//자바는 ,가 올수 없다. string 하나가 오기에 +로 연결
		
//		System.out.println();			//ctrl+/ : 문장을 커멘트 처리 / 처리X
	}
}
