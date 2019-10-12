import java.util.Scanner;

public class ElMundoBot {
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la palabra para la busqueda:");
		String keyword = sc.nextLine();
		
		String url = "http://ariadna.elmundo.es/buscador/archivo.html?q="+keyword+"&fd=0&td=0&n=50&w=60&s=0";
		String newspaper = "//www.elmundo.es/";
		
		WebScrapBot wsb = new WebScrapBot(url, newspaper);
	}
}
