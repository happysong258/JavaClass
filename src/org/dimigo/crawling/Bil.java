package org.dimigo.crawling;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Bil {
    public static void main(String[] args) throws IOException{
            String url="https://www.melon.com/chart/index.htm";
            Document doc= Jsoup.connect(url).get();
            Elements titles=doc.select("div.ellipsis").select("span");
            for(Element e:titles)
            {
                String song=e.text();
                System.out.println("제목:"+song);
            }
            System.out.println("============");
        }
}
