package extra_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RoadAddrApi {

	public String getRoadAddr(String keyword) throws Exception {
			BufferedReader br = new BufferedReader(new FileReader("c:/Temp/roadApiKey.txt"));
			String confmKey = br.readLine();
			br.close();
			int currentPage = 1, countPerPage = 5;
			String resultType = "json";
			keyword = URLEncoder.encode(keyword, "utf-8");
			String apiUrl = "https://www.juso.go.kr/addrlink/addrLinkApi.do"
					+ "?confmKey=" + confmKey
					+ "&currentPage=" + currentPage 
					+ "&countPerPage=" + countPerPage 
					+ "&resultType=" + resultType
					+ "&keyword=" + keyword;
			
			URL url = new URL(apiUrl);
			br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer sb = new StringBuffer();
			String tempStr = null;
			
			while(true) {
				tempStr = br.readLine();
				if(tempStr == null)
					break;
				sb.append(tempStr);							
			}
			br.close();
			
			
			//JSON 데이터에서 원하는 값 추출하기
			JSONParser parser = new JSONParser();
			JSONObject object = (JSONObject) parser.parse(sb.toString());
			JSONObject results = (JSONObject) object.get("results");
			JSONArray juso = (JSONArray) results.get("juso");
			JSONObject jusoItem = (JSONObject) juso.get(0);
//			System.out.println(jusoItem.keySet());
			String roadAddr = (String) jusoItem.get("roadAddr");
			
			return roadAddr;
			
			
//			return sb.toString();
	}
}
