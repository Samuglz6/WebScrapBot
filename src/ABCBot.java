import java.io.IOException;
import java.util.ArrayList;

public class ABCBot extends WebScrapBot{
    private ArrayList<String> datos;
    
    public ABCBot(String busqueda) throws IOException {
        super("https://www.abc.es/hemeroteca/resultados-busqueda-avanzada/todo?tod="+busqueda+"&rfec=20181024;20191024&nres=20");
        datos = new ArrayList<String>();
        datos.add("div.clearfix > ul.clearfix > li > h2 > a");
        
        this.extraer(this.getUrl(), datos);
    }   
}
