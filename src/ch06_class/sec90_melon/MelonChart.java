package ch06_class.sec90_melon;

public class MelonChart {
	private int rank;
	private String title;
	private String artist;
	private String album;
	private int like;
	
	public MelonChart() { }		//기본생성자, 다른 생성자가 있으면 만드시 만들어 줄 것
	public MelonChart(int rank, String title, String artist, String album, int like) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}


	@Override
	public String toString() {
		return "MelonChart [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", like="
				+ like + "]";
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


	public int getLike() {
		return like;
	}


	public void setLike(int like) {
		this.like = like;
	}
	
	
	

}
