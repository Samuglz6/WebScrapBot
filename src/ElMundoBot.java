import java.io.IOException;
import java.util.ArrayList;

public class ElMundoBot extends WebScrapBot{
	
    private ArrayList<String> datos;
    
    public ElMundoBot(String busqueda) throws IOException {
        super("http://ariadna.elmundo.es/buscador/archivo.html?q="+busqueda+"&fd=365&td=0&n=50&w=60&s=0&fecha_busq_avanzada=1");
        datos = new ArrayList<String>();
        datos.add("ul.lista_resultados > li:not(.accesos_directos) > h3 > a");
        datos.add("div.num_resultados > ul > li > a");
        datos.add("Siguiente");
        
        this.extraer(this.getUrl(), datos);
    }
}
