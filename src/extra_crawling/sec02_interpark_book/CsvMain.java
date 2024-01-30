package extra_crawling.sec02_interpark_book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import extra_crawling.csv.CsvUtil;
import extra_crawling.csv.CsvUtilImpl;

public class CsvMain {

	public static void main(String[] args) throws IOException {
		InterparkBookService interparkBookService = new InterparkBookService();
		CsvUtil csvUtil = new CsvUtilImpl();

		List<InterparkBook> list = interparkBookService.getBestSeller();
		List<List<String>> csvList = new ArrayList<List<String>>();
		for (InterparkBook ib: list) {
			List<String> line = new ArrayList<String>();
			line.add(ib.getRank() + "");
			line.add(ib.getTitle()); line.add(ib.getAuthor()); line.add(ib.getCompany());
			line.add(ib.getPrice() + "");
			csvList.add(line);
		}
		csvUtil.writeCsv("c:/Temp/interpark.tsv", csvList, "\t");

	}
}
