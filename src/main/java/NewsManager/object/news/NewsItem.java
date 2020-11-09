package NewsManager.object.news;

public class NewsItem {
	private String title;
	private String contents;
	private String link;
	private String thumbnail;
	

	// Constructor
	public NewsItem(String title, String contents, String link, String thumbnail) {
		this.title = title;
		this.contents = contents;
		this.link = link;
		this.thumbnail = thumbnail;
	}
	public NewsItem(String title, String contents, String link) {
		this(title, contents, link, null);
	}
	public NewsItem(String title, String contents) {
		this(title, contents, null, null);
	}

	// getter & setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
