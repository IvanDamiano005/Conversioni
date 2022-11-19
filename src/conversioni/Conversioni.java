package conversioni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author utente
 */
public class Conversioni {
    
   public static int val(char c){
       if (c >= '0' && c <= '9')
           return(int)c - '0';
       else
           return(int)c - 'A' + 10;
   }

   public static int toDecimale(String numero, int basePartenza){
       int lunghezzaNumero = numero.length();
       int potenza = 1;
       int num = 0;
       
       for(int i = lunghezzaNumero-1; i>=0; i--){
           if(val(numero.charAt(i)) >= basePartenza){
               System.out.println("valore non valido");
               return -1;
           }
           num+=val(numero.charAt(i))*potenza;
           potenza=potenza*basePartenza;
        }
       return num;
   }
   
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