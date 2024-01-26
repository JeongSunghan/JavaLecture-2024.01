package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
			MelonChartService melonChartService = new MelonChartService();
			List<MelonChart> list = melonChartService.getBestMusic();
			list.forEach(x -> System.out.println(x));
	}
}
