import java.io.IOException;
import java.util.ArrayList;

public class ElMundoBot extends WebScrapBot{
	
    private ArrayList<String> datos;
    
    public ElMundoBot(String busqueda) throws IOException {
        super("http://ariadna.elmundo.es/buscador/archivo.html?q="+busqueda+"&fd=365&td=0&n=50&w=60&s=0&fecha_busq_avanzada=1");
        datos = new ArrayList<String>();
        datos.add("ul.lista_resultados");
        datos.add("li:not(.accesos_directos)");
        datos.add("h3");
        datos.add("a[href]");
        
        this.extraer(this.getUrl(), datos);
    }
}
