package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class Main {
	
	/*	크롤링 7단계
	 *  1. 사이트에 접속하고 HTML 데이터를 가져와 파싱
	 * 	2. 원하는 데이터 찾기(<li>, <tr>) 등등
	 * 	3. 하나를 선택해서 원하는 정보 추출(연습게임)
	 * 	4. 반복문을 사용하여 페이지 내에 있는 데이터 가져오기
	 * 	5. 오류가 발생하면 오류를 해결하고 2~4 과정을 반복
	 *  6. 모든 페이지에 대해 반복하기
	 *  7. CSV(Comma Separated Values) 파일로 만들기
	 * */
	 
	
	
	public static void main(String[] args) throws IOException {
			MelonChartService melonChartService = new MelonChartService();
			List<MelonChart> list = melonChartService.getBestMusic();
			list.forEach(x -> System.out.println(x));
			
			//object형태로 해서 찍어내보기 -> csv형태
	}
}
