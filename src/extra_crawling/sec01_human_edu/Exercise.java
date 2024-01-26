package extra_crawling.sec01_human_edu;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Exercise {

	public static void main(String[] args) throws IOException {
		String url = "https://www.human.or.kr/";
		Document doc = Jsoup.connect(url).get();
		
		//1개의 엘리멘트
		Element strong = doc.selectFirst(".f_right > strong");
		//속성 strong에서 f_right 가져오기
		System.out.println(strong.text());
		
		Element address = doc.selectFirst(".f_left > address");
		//속성 add에서 f_left 가져오기
//		System.out.println(address.html());
		String[] addressArray = address.html().split("<br>");
//		for (String addr: addressArray)
//			System.out.println(addr);
		List<String> addressList = new ArrayList<String>();
		for(String addr: addressArray) {
			addressList.add(addr.strip());
		}
		addressList.forEach(x-> System.out.println(x));
		
		
		//한글 주소는 인코딩이 된 후 보인다
//		url = "https://www.human.or.kr/program?sca=%EC%88%98%EC%9B%90";
		url = "https://www.human.or.kr/program?sca=" + URLEncoder.encode("수원", "utf-8");
		doc = Jsoup.connect(url).get();
		
		//여러개의 엘리먼트
		//클래스 이름마다 점을 붙여야함
//		Elements lis = doc.select(".dp_li.num-1");
//		System.out.println(lis.size());
		
/*		
		Element li = lis.get(0);	//lis 여러개 중 첫번쨰 li
		String title = li.selectFirst(".txt_wrap > h2").text().strip();
		String desc = li.selectFirst(".txt_content").text().strip();
		System.out.println(title);
		System.out.println(desc);
*/		
		//반복문을 통한 방법
//		for (Element li: lis) {
//			String title = li.selectFirst(".txt_wrap > h2").text().strip();
//			String desc = li.selectFirst(".txt_content").text().strip();
//			System.out.println(title);
//			System.out.println(desc);		
//			System.out.println("=========================================");
			
		
			//서울, 수원, 천안의 과정을 출력
			for (String place : new String[] {"서울", "수원", "천안"}) {
				url = "https://www.human.or.kr/program?sca=" + URLEncoder.encode(place, "utf-8");
				doc = Jsoup.connect(url).get();
				
				Elements lis = doc.select(".dp_li.num-1");
				System.out.println(place + "과정수" + lis.size());
				
				for (Element li: lis) {
					String title = li.selectFirst(".txt_wrap > h2").text().strip();
					String desc = li.selectFirst(".txt_content").text().strip();
					System.out.println(title);
					//System.out.println(desc);		
			}
				System.out.println("=========================================");
		}
	}

}
