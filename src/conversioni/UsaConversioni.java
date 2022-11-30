package Conversioni;

import static conversioni.Conversioni.fromDecimale;
import static conversioni.Conversioni.toDecimale;
import java.io.BufferedReader;
import java.io.FileReader;
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
        int basePartenza = 0, baseArrivo = 0, appo = 0;
        String numero = null, appo1 = null;
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
                throw new RuntimeException("inserire una scelta valida");
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
                       if(baseArrivo!=10){
                        appo = toDecimale(numero, basePartenza);
                        appo1 = fromDecimale(appo, baseArrivo);
                        System.out.println("Il numero in base: " + baseArrivo + " e': " + appo1);
                    }else{
                        int x=toDecimale(numero, basePartenza);
                        System.out.println("Il numero in base 10 e': " + x);
                    }
                case 3:
                    FileWriter fout = new FileWriter("Conversioni.txt");
                    PrintWriter out = new PrintWriter(fout);
                    out.println(appo1);
                    fout.close();
                    
                    FileReader fin = new FileReader("Conversioni.txt");
                    BufferedReader in = new BufferedReader(fin);
                    String riga = in.readLine();
                    while(riga != null){
                        System.out.println(riga);
                        riga = in.readLine();
                    }
                    fin.close();
                break;
                case 4:
                    exit = true;
                break;
            }
        }while(!exit);
    }
}
