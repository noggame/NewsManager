package NewsManager;

import java.util.List;

import NewsManager.crawler.JosunNewsCrawler;
import NewsManager.crawler.object.NewsCrawler;
import NewsManager.object.news.NewsItem;

public class TestMain {

	public static void main(String[] args) {

		NewsCrawler josun = new JosunNewsCrawler();
		List<NewsItem> josunFinanceNews = josun.getNewsList("https://biz.chosun.com/site/data/rss/rss.xml");
		
//		for(NewsItem ni : josunFinanceNews) {
//			System.out.println(ni.getTitle());
//			System.out.println(ni.getContents()); 
//			System.out.println(ni.getLink());
//			System.out.println(ni.getThumbnail());
//			System.out.println();
//		}
		
		NewsItem ni = ((JosunNewsCrawler)josun).getNewsRawData(josunFinanceNews.get(0).getLink());
//		System.out.println(ni.getTitle());
//		System.out.println(ni.getContents());
		
	}

}
