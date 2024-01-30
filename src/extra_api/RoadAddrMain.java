package extra_api;

public class RoadAddrMain {

	public static void main(String[] args) throws Exception {
		RoadAddrApi api = new RoadAddrApi();
		System.out.println(api.getRoadAddr("경기도청"));
	}

}
