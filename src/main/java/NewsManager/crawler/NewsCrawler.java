package NewsManager.crawler;

public interface NewsCrawler {
	public NewsList getNewsList(NewsItem newsItem);
	public String getTitle(String url);
	public String getContents(String url);
}
