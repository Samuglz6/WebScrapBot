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

		Elements result = doc.select(datos.get(0)).select(datos.get(1)).select(datos.get(2)).select(datos.get(3));
		
		for(Element element : result)
		{
		    links.add(element.attr("href"));
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
