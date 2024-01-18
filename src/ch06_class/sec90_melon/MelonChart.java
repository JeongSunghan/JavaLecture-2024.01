package ch06_class.sec90_melon;

//public class MelonChart {
	class Song {
		private String rank;
		private String title;
		private String artist;
		private String album;
		private String like;

		public Song (String rank, String title, String artist, String album, String like) {
			this.rank = rank;
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.like = like;
		}

		public void displayInfo() {
			System.out.println(
					"rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", like=" + like);
		}
	}

//}
