package NewsManager.crawler;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import NewsManager.crawler.object.NewsCrawler;
import NewsManager.object.news.NewsItem;

public class JosunNewsCrawler implements NewsCrawler {
	
	@Override
	public List<NewsItem> getNewsList(String url) {
		
		List<NewsItem> newsList = new LinkedList<NewsItem>();
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements itemList = doc.getElementsByTag("item");
			
			// get data from each NewsItem
			for (Element item : itemList) {
				// @ title = item.getElementsByTag("title").text()
				// @ contents = Jsoup.parse(item.getElementsByTag("description").text()).getElementsByTag("body").get(0).ownText()
				// @ thumbnail = Jsoup.parse(item.getElementsByTag("description").text()).getElementsByTag("img").attr("src")
				
				
				NewsItem news = new NewsItem(
						item.getElementsByTag("title").text(),
						Jsoup.parse(item.getElementsByTag("description").text()).getElementsByTag("body").get(0).ownText(),
						item.getElementsByTag("link").text(),
						Jsoup.parse(item.getElementsByTag("description").text()).getElementsByTag("img").attr("src")
						);
				
				newsList.add(news);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return newsList;
	}
	
	public NewsItem getNewsRawData(String link) {
		NewsItem ni = new NewsItem();
		
		try {
			Document doc = Jsoup.connect("https://biz.chosun.com/site/data/html_dir/2020/11/10/2020111003266.html").get();	// @ change to link
			StringBuffer sb = new StringBuffer();

			for(Element phaseElement : doc.getElementById("news_body_id").getElementsByClass("par")) {
				sb.append(phaseElement.ownText());
			}
			
			// 문단 끝은 개행문자 삽입하여 저장
			ni.setContents(sb.toString().replaceAll("[.] ", ".\n\n"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ni;
	}
}
