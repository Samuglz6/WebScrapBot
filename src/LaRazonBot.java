import java.io.IOException;
import java.util.ArrayList;

public class LaRazonBot extends WebScrapBot{
    private ArrayList<String> datos;
    
    public LaRazonBot(String busqueda) throws IOException {
        super("https://www.eldiario.es/buscador/?text="+busqueda);
        datos = new ArrayList<String>();
        datos.add("div.pg-body > div:not(md-tags nws lst) > ul > li > section > div.mtflow > h2 > a");        
        datos.add("div.pg-body > nav:not(cp-paginator bb) > ul > li > a");
        datos.add("Siguiente");
        
        this.extraer(this.getUrl(), datos);
    }   
}
