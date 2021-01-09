package vo;

public class TvVO {
	private int tvId;
	private String title;
	private String date;
	private float score;
	private String context;
	private String image;
	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public TvVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TvVO [tvId=" + tvId + ", title=" + title + ", date=" + date + ", score=" + score + ", context="
				+ context + "]";
	}
	
	public int getTvId() {
		return tvId;
	}
	public void setTvId(int tvId) {
		this.tvId = tvId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
}
