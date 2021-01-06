package vo;

import java.util.Date;

public class MovieVO {
	private String movieId;
	private String title;
	private Date date;
	private Float score;
	private String context;
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "MovieVO [movieId=" + movieId + ", title=" + title + ", date=" + date + ", score=" + score + ", context="
				+ context + "]";
	}
	
}
