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
            WebScrapBot mundo = new ElMundoBot(busqueda);
            WebScrapBot abc = new ABCBot(busqueda);
            
            //This line will print each element from the ArrayList in a new line
            System.out.println("\nBBC BOT");
            bbc.getLinks().forEach(System.out::println);

            System.out.println("\nEL MUNDO BOT");
            mundo.getLinks().forEach(System.out::println);
            
            System.out.println("\nABC BOT");
            abc.getLinks().forEach(System.out::println);
            
            /*for(int i = 0; i <= 5; i++)
            {
                int random = (int)(Math.random() * mundo.getLinks().size()+1);
                URI uri = new URI(mundo.getLinks().get(random));
                Desktop.getDesktop().browse(uri);
            }*/
        }
}
