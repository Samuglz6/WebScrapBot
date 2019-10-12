import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrapBot 
{
	public WebScrapBot(String url, String newspaper)
	{			
			try
			{
				extraerMundo(url, newspaper);
			}
			catch(Exception e)
			{
				
			}
	}	
	
	public static void extraerMundo(String url, String newspaper) throws IOException
	{
		Document doc = Jsoup.connect(url).get();
		
		Elements links = doc.getElementsByTag("a");
		
		for(Element link : links)
		{
			if(link.attr("href").contains(newspaper) && !link.attr("href").contains("http://"))
				System.out.println(link.attr("href"));
		}
	}
	
	
}
