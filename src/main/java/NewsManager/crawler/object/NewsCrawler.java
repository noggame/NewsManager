package NewsManager.crawler.object;

import java.util.List;

import NewsManager.object.news.NewsItem;

public interface NewsCrawler {
	
	/**
	 * url�κ��� ���� ������ ������ NewsItem ��ü�� ����� ��ȯ
	 * @param url
	 * @return
	 */
	public List<NewsItem> getNewsList(String url);
}
