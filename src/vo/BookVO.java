package vo;

public class BookVO {
	private int bookId;
	private String title;
	private String writer;
	private Float score;
	private String context;
	
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", title=" + title + ", writer=" + writer + ", score=" + score
				+ ", context=" + context + "]";
	}

	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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

	
	
	
}
