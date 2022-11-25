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
        int basePartenza = 0, baseArrivo = 0;
        String numero = null;
        boolean exit = false;
        do{
            System.out.println("('1') Inserimento dati");
            System.out.println("('2') Calcolo e visualizzazzione conversione");
            System.out.println("('3') Salvare i dati su file");
            System.out.println("('4') Uscita programma");
            System.out.println("-Inserisci scelta-");
            Scanner tast = new Scanner(System.in);
            int scelta = tast.nextInt();
            if(scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4){
                throw new RuntimeException("valore fuori scala");
            }

            switch(scelta) {
                case 1:
                    System.out.println("Inserisci la base di partenza del numero: ");
                    Scanner tastiera1 = new Scanner(System.in);
                    basePartenza = tastiera1.nextInt();

                    System.out.println("Inserisci la base di arrivo: ");
                    Scanner tastiera2 = new Scanner(System.in);
                    baseArrivo = tastiera2.nextInt();

                    System.out.println("Inserisci il numero: ");
                    Scanner tastiera = new Scanner(System.in);
                    numero = tastiera.nextLine();
                    break;
                case 2:
                    
                case 3:
                    //visualozzazione file
                break;
                case 4:
                    exit = true;
                break;
            }
        }while(!exit);
    }
}
