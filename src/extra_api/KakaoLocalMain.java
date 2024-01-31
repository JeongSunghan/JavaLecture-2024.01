package extra_api;

import java.util.Map;

public class KakaoLocalMain {

	public static void main(String[] args) throws Exception {
		KakaoLocalApi api = new KakaoLocalApi();
		Map<String, Double> map = api.getGeocode("경기도 수원시 영통구 도청로 30 (이의동)");
		System.out.println(map);
	}

}