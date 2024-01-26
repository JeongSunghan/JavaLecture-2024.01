package extra_crawling.sec01_human_edu;

public class Course {
	private String place;
	private String title;
	private String desc;

	
	public Course() {}
	public Course(String place, String title, String desc) {
		super();
		this.place = place;
		this.title = title;
		this.desc = desc;
	}

	
	

	@Override
	public String toString() {
		return "Course [place=" + place + ", title=" + title + ", desc=" + desc + "]";
	}
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
