import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrapBot 
{
	ArrayList<String> busquedas;
	
	public WebScrapBot(String url, String newspaper) throws IOException
	{			
			busquedas = new ArrayList<String>(); 
			extraerMundo(url, newspaper);			
	}	
	
	public void extraerMundo(String url, String newspaper) throws IOException
	{
		Document doc = Jsoup.connect(url).get();
		
		Elements links = doc.getElementsByTag("a");
		
		for(Element link : links)
		{
			if(link.attr("href").contains(newspaper) && !link.attr("href").contains("http://"))
				this.busquedas.add(link.attr("href"));
		}
	}
	
	public ArrayList<String> getBusquedas()
	{
		return this.busquedas;
	}
	
	
}
