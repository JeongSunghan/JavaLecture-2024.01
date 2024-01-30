package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MelonChartService {

	public static List<MelonChart> getBestMusic() throws IOException {		//static 뺴야
		String url = "https://www.melon.com/chart/index.htm";
		Document doc = Jsoup.connect(url).get();
		Elements trs = doc.select(".service_list_song.type02.d_song_list > table > tbody > tr");

		List<MelonChart> list = new ArrayList<MelonChart>();
		for (Element tr : trs) {
			String rank_ = tr.selectFirst(".rank").text().strip();
		
			int rank = Integer.parseInt(rank_);
			String title = tr.selectFirst(".ellipsis.rank01 > span > a").text().strip();
			String artist = tr.selectFirst(".ellipsis.rank02 > a").text().strip();
			String album = tr.selectFirst(".ellipsis.rank03 > a").text().strip();
			String src = tr.selectFirst("td:nth-child(4) > div > a > img").attr("src");
			MelonChart mc = new MelonChart(rank, title, artist, album, src);
			list.add(mc);
		}
		return list;

	}

}
