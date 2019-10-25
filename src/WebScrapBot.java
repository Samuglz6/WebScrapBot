import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrapBot 
{
	private ArrayList<String> links;
	private String url;
	
	public WebScrapBot(String url) throws IOException
	{			
	        this.url = url;
			links = new ArrayList<String>(); 
	}	
	
	public void extraer(String url, ArrayList<String> datos) throws IOException
	{
		Document doc = Jsoup.connect(url).get();

		Elements result = doc.select(datos.get(0));
		
		for(Element element : result)
		{
		    links.add(element.attr("href"));
		}
	
		
		Elements next = doc.select(datos.get(1));
		
		for(Element element : next)
		{
			if(url.contains("elmundo") && element.text().contains(datos.get(2)))
			{
				url = "https:" + element.attr("href");
				extraer(url, datos);
				break;
			}
		
		    if(url.contains("bbc") && element.hasClass(datos.get(2)))
		    {
		        url = url.split("[?]q=")[0] + element.attr("href");
		        extraer(url, datos);
		        break;
		    } 
		    
		    if(url.contains("eldiario") && element.text().contains(datos.get(2)))
		    {
		    	url = url.split("/buscador")[0] + element.attr("href");
		    	extraer(url, datos);
		    	break;
		    }
		}
	}
	
	public ArrayList<String> getLinks()
	{
		return this.links;
	}

    public String getUrl() {
        return url;
    }
}
