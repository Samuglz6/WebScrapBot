import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ElMundoBot {
	public static void main(String [] args) throws URISyntaxException, IOException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la palabra para la busqueda:");
		String keyword = sc.nextLine();
		
		String url = "http://ariadna.elmundo.es/buscador/archivo.html?q="+keyword+"&fd=0&td=0&n=50&w=60&s=0";
		String newspaper = "//www.elmundo.es/";
		
		WebScrapBot wsb = new WebScrapBot(url, newspaper);
		
		for(int i = 0; i <= 5; i++)
		{
			int random = (int)(Math.random() * wsb.getBusquedas().size()+1);
			URI uri = new URI(wsb.getBusquedas().get(random));
			
			Desktop.getDesktop().browse(uri);
		}
	
		System.out.println("Done");
	}
}
