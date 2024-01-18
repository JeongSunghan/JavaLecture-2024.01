package ch06_class.sec90_melon;


public class MelonCahrt_Main {
	
	class MelonChart {
		public static void main(String[] args) {
		Song[] chart = {
				new Song ("1", "곡 제목1", "아티스트1", "앨범1", "좋아요 수1"),
				new Song ("2", "곡 제목2", "아티스트2", "앨범2", "좋아요 수2"),
				new Song ("3", "곡 제목3", "아티스트3", "앨범3", "좋아요 수3"),
				new Song ("4", "곡 제목4", "아티스트4", "앨범4", "좋아요 수4"),
				new Song ("5", "곡 제목5", "아티스트5", "앨범5", "좋아요 수5"),
				
		};
		
		displayChart(chart);	
		
		}
		
		public static void
			displayChart(Song[] chart) {
			for (Song song : chart) {
				song.displayInfo();
			}
			System.out.println(chart);
		}

	}
}


