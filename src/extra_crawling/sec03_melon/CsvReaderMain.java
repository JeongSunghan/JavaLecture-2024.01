package extra_crawling.sec03_melon;

import java.util.List;

import extra_crawling.csv.CsvUtil;
import extra_crawling.csv.CsvUtilImpl;

public class CsvReaderMain {

	public static void main(String[] args) {
		CsvUtil	csvUtil = new CsvUtilImpl();
		List<List<String>> csvList = csvUtil.readCsv("c:/Temp/melonchart2.tsv", "\t");
		
		for (List<String> line : csvList) {
			MelonChart mc = new MelonChart();
			System.out.println(mc);
		}
	}

}
