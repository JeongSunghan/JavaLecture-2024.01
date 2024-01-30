package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import extra_crawling.csv.CsvUtil;
import extra_crawling.csv.CsvUtilImpl;

public class CsvMain {

	public static void main(String[] args) throws IOException {
		MelonChartService melonChartService = new MelonChartService();
		CsvUtil csvUtil = new CsvUtilImpl();

		List<MelonChart> list = MelonChartService.getBestMusic();
		List<List<String>> csvList = new ArrayList<List<String>>();
		for (MelonChart mc : list) {
			List<String> line = new ArrayList<String>();
			line.add(mc.getRank() + "");
			line.add(mc.getTitle());
			line.add(mc.getArtist());
			line.add(mc.getAlbum());
			line.add(mc.getImgSrc() + "");
			csvList.add(line);
		}
		csvUtil.writeCsv("c:/Temp/melonchart.tsv", csvList, "\t");

	}
}
