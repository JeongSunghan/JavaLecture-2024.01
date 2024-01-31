package extra_api;

import java.util.Map;

public class MapMain {

	public static void main(String[] args) throws Exception {
		RoadAddrApi roadApi = new RoadAddrApi();
		KakaoLocalApi kakaoApi = new KakaoLocalApi();

		String[] places = { "경기도청", "팔달구청", "장안구청", "영통구청", "권선구청", };
		for (String place : places) {
			String roadAddr = roadApi.getRoadAddr(place);
			Map<String, Double> geoCode = kakaoApi.getGeocode(roadAddr);
			System.out.printf("%s: %s, %.6f, %.6f%n ", place, roadAddr, geoCode.get("lat"), geoCode.get("lol"));
		}
	}

}
