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
            
            System.out.println("Introduce la palabra de busqueda:");
            String busqueda = sc.nextLine();
            
            WebScrapBot bbc = new BBCBot(busqueda);
            System.out.println("\nBBC BOT");
            System.out.println(bbc.getLinks().size());
            
            //WebScrapBot mundo = new ElMundoBot(busqueda);
            //WebScrapBot abc = new ABCBot(busqueda);
            
            
            
           

            System.out.println("\nEL MUNDO BOT");
           
            
            System.out.println("\nABC BOT");
          
            
            //This line will print each element from the ArrayList in a new line
            //bbc.getLinks().forEach(System.out::println);
            
            //Accesing a random link and open it in the browser  
            /*
                URI uri = new URI(mundo.getLinks().get((int)(Math.random() * mundo.getLinks().size()+1)));
                Desktop.getDesktop().browse(uri);
            */
        }
}
