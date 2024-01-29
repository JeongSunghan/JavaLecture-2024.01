package extra_crawling.sec03_melon;

public class MelonChart {
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String imgSrc;

	
	public MelonChart() {}
	public MelonChart(int rank, String title, String artist, String album, String imgSrc) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		return String.format("%2d %s | %s | %s | %s", rank, title, artist, album, imgSrc);
//		return "MelonChart [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", imgSrc="
//				+ imgSrc + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

}
