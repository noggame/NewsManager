package NewsManager.crawler.object;

import java.util.List;

import NewsManager.object.news.NewsItem;

public interface NewsCrawler {
	
	/**
	 * url로부터 뉴스 정보를 추출해 NewsItem List 반환
	 * @param url
	 * @return
	 */
	public List<NewsItem> getNewsList(String url);
}
