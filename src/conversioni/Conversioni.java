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
}