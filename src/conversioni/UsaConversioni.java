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
        System.out.println("Inserisci la base di partenza del numero: ");
        Scanner tastiera1 = new Scanner(System.in);
        int basePartenza = tastiera1.nextInt();
       
        System.out.println("Inserisci il numero: ");
        Scanner tastiera = new Scanner(System.in);
        String numero = tastiera.nextLine();
        if(basePartenza == 2){
            System.out.println("Inserisci la base di arrivo: ");
            Scanner tastiera2 = new Scanner(System.in);
            int baseArrivo = tastiera2.nextInt();
            if(baseArrivo == 8){
           
            }else if(baseArrivo == 10){
               int x = toDecimale(numero,2);
            }else if(baseArrivo == 16){
           
            }
        }else if(basePartenza == 8){
            System.out.println("Inserisci la base di arrivo: ");
            Scanner tastiera2 = new Scanner(System.in);
            int baseArrivo = tastiera2.nextInt();
            if(baseArrivo == 2){
           
            }else if(baseArrivo == 10){
               int x = toDecimale(numero,8);
            }else if(baseArrivo == 16){
           
            }
        }else if(basePartenza == 10){
            System.out.println("Inserisci la base di arrivo: ");
            Scanner tastiera2 = new Scanner(System.in);
            int baseArrivo = tastiera2.nextInt();
            if(baseArrivo == 2){
           
            }else if(baseArrivo == 8){
               
            }else if(baseArrivo == 16){
           
            }
        }else if(basePartenza == 16){
            System.out.println("Inserisci la base di arrivo: ");
            Scanner tastiera2 = new Scanner(System.in);
            int baseArrivo = tastiera2.nextInt();
            if(baseArrivo == 2){
           
            }else if(baseArrivo == 8){
                
            }else if(baseArrivo == 10){
                int x = toDecimale(numero,16);
            }
        }
        int x = toDecimale(numero,basePartenza);
        System.out.println("Il numero in base 10 e': " + x);
   }
}
    