package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class Weptoon {
    /*public static void main(String[] args) {
        //네이버웹툰
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            System.out.println(doc.html());
            Element result = doc.select("[id=realTimeRankChoiceTabFavoriteClick] li a");
            List<String> list = result.eachText();
            for(String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
