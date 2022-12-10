package Conversioni;

import static conversioni.Conversioni.acquisisciDati;
import static conversioni.Conversioni.fromDecimale;
import static conversioni.Conversioni.toDecimale;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ivand
 */
public class UsaConversioni {
    public static void main(String[] args) throws IOException{
        int basePartenza = 0, baseArrivo = 0, appo = 0, x = 0, scelta;
        String numero = null, appo1 = null;
        boolean exit = false;
        
        do{ 
            scelta = acquisisciDati();
            
            Scanner tastiera = new Scanner(System.in);
            Scanner tastiera1 = new Scanner(System.in);
            Scanner tastiera2 = new Scanner(System.in);
            
            switch(scelta) {
                case 1:
                    do{
                        System.out.println("Inserisci la base di partenza del numero: ");
                        basePartenza = tastiera.nextInt();
                    }while(basePartenza < 2 || basePartenza > 16);    
                        
                    do{
                        System.out.println("Inserisci la base di arrivo: ");
                        baseArrivo = tastiera1.nextInt();
                    }while(baseArrivo < 2 || baseArrivo > 16);
                        
                    System.out.println("Inserisci il numero: ");
                    numero = tastiera2.nextLine();
                    
                    break;
                case 2:
                    if(baseArrivo!=10){
                        appo = toDecimale(numero, basePartenza);
                        appo1 = fromDecimale(appo, baseArrivo);
                        System.out.println("Il numero in base: " + baseArrivo + " e': " + appo1);
                    }else{
                        x = toDecimale(numero, basePartenza);
                        System.out.println("Il numero in base 10 e': " + x);
                    }
                break;
                
                case 3:
                    FileWriter fout = new FileWriter("Conversioni.txt", true);
                    PrintWriter out = new PrintWriter(fout);
                    if(baseArrivo != 10){
                        out.println("Il numero che hai appena convertito e': " + appo1);
                    }else{
                        out.println("Il numero che hai appena convertito e': " + x);
                    }
                    fout.close();
                break;
                
                case 4:
                    exit = true;
                break;
            }
        }while(!exit);
    }
}
