import java.io.IOException;
import java.util.ArrayList;

public class BBCBot extends WebScrapBot{
    private ArrayList<String> datos;
    
    public BBCBot(String busqueda) throws IOException {
        super("https://www.bbc.com/mundo/search/?q="+busqueda);
        datos = new ArrayList<String>();
        datos.add("div.ws-search-components > div:not(hard-news-unit hard-news-unit--regular faux-block-link) > div:not(hard-news-unit__body) > h3 > a");
        datos.add("div.ws-search-pagination > a");
        
        this.extraer(this.getUrl(), datos);
    }
}
