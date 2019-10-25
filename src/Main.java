import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

        @SuppressWarnings("resource")
        public static void main(String [] args) throws IOException, URISyntaxException
        {
            Scanner sc = new Scanner(System.in);
            long t1,t2;
            
            System.out.println("Introduce la palabra de busqueda:");
            String busqueda = sc.nextLine();
            
            t1 = System.currentTimeMillis();
            WebScrapBot mundo = new ElMundoBot(busqueda);
            t2 = System.currentTimeMillis();
            System.out.println("\nEL MUNDO BOT");
            System.out.println(mundo.getLinks().size() + " Noticias");
            System.out.printf("Tiempo de recuperacion: %d s\n", (t2-t1)/1000);
            
            t1 = System.currentTimeMillis();
            WebScrapBot bbc = new BBCBot(busqueda);
            t2 = System.currentTimeMillis();
            System.out.println("\nBBC BOT");
            System.out.println(bbc.getLinks().size() + " Noticias");
            System.out.printf("Tiempo de recuperacion: %d s\n", (t2-t1)/1000);
               
            t1 = System.currentTimeMillis();
            WebScrapBot abc = new LaRazonBot(busqueda);
            t2 = System.currentTimeMillis();
            System.out.println("\nLA RAZON BOT");
            System.out.println(abc.getLinks().size()+" Noticias");
            System.out.printf("Tiempo de recuperacion: %d s\n", (t2-t1)/1000);
          
            
            //This line will print each element from the ArrayList in a new line
            //bbc.getLinks().forEach(System.out::println);
            
            //Accesing a random link and open it in the browser  
            /*
                URI uri = new URI(mundo.getLinks().get((int)(Math.random() * mundo.getLinks().size()+1)));
                Desktop.getDesktop().browse(uri);
            */
        }
}
