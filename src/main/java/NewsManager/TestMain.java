package NewsManager;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import NewsManager.crawler.JosunNewsCrawler;
import NewsManager.crawler.object.NewsCrawler;
import NewsManager.object.news.NewsItem;

public class TestMain {

	public static void main(String[] args) {

		NewsCrawler josun = new JosunNewsCrawler();
		List<NewsItem> josunFinanceNews = josun.getNewsList("https://biz.chosun.com/site/data/rss/rss.xml");
		
		for(NewsItem ni : josunFinanceNews) {
			System.out.println(ni.getTitle());
			System.out.println(ni.getContents());
			System.out.println(ni.getLink());
			System.out.println(ni.getThumbnail());		// isEmpty로 확인가능
			System.out.println();
		}
		// test parsing
//		try {
//			
//			Document doc = Jsoup.connect("http://biz.chosun.com/site/data/rss/rss.xml").get();
//			
//			Elements paragraphs = doc.getElementsByTag("item");
//			
//			for (Element paragraph : paragraphs) {
//				System.out.println(paragraph.getElementsByTag("title").text());
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
