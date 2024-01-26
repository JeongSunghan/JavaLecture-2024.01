package extra_crawling.sec03_melon;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Exercise {

	public static void main(String[] args) throws IOException {
		String url = "https://www.melon.com/chart/index.htm";
		Document doc = Jsoup.connect(url)
//				.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
//				.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
				.get();
		
		Elements trs = doc.select(".service_list_song.type02.d_song_list > table > tbody > tr");
		System.out.println(trs.size());

		Element tr = trs.get(0);
		String rank_ = tr.selectFirst(".rank").text().strip();
		int rank = Integer.parseInt(rank_);
		String title = tr.selectFirst(".ellipsis.rank01 > span > a").text().strip();
		String artist = tr.selectFirst(".ellipsis.rank02 > a").text().strip();
		String album = tr.selectFirst(".ellipsis.rank03 > a").text().strip();
		String src = tr.selectFirst("td:nth-child(4) > div > a > img").attr("src");
		System.out.println(rank + ", " + title + ", " + artist + ", " + album + ", " + src);
	}

}