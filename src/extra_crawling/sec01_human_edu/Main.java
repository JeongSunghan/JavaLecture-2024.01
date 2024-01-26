package extra_crawling.sec01_human_edu;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Course> list = new ArrayList<Course>();
		for (String place : new String[] { "서울", "수원", "천안" }) {
			String url = "https://www.human.or.kr/program?sca=" + URLEncoder.encode(place, "utf-8");
			Document doc = Jsoup.connect(url).get();

			Elements lis = doc.select(".dp_li.num-1");
			System.out.println(place + "과정수" + lis.size());
			
			for (Element li: lis) {
				String title = li.selectFirst(".txt_wrap > h2").text().strip();
				String desc = li.selectFirst(".txt_content").text().strip();
				Course course = new Course(place, title, desc);
				list.add(course);
			}
		}
		for (Course c: list)
			System.out.println(c);
	}
}



