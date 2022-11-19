package conversioni;

import static conversioni.Conversioni.toDecimale;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class UsaConversioni {
    public static void main(String[] args) throws IOException{
       System.out.println("Inserisci il numero: ");
       Scanner tastiera = new Scanner(System.in);
       String numero = tastiera.nextLine();
       
       System.out.println("Inserisci la base di partenza del numero");
       Scanner tastiera2 = new Scanner(System.in);
       int basePartenza = tastiera2.nextInt();
       
       int x = toDecimale(numero,basePartenza);
       System.out.println("Il numero in base 10 e': " + x);
   }
}
