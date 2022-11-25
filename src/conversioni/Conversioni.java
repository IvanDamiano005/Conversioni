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
    
   private int basePartenza;
   private int baseArrivo;
   private String numero;
   public static final char[] vet= new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   
    public Conversioni(int basePartenza, int baseArrivo, String numero){
       this.basePartenza=basePartenza;
       this.baseArrivo=baseArrivo;
       this.numero=numero;
    }
    
    public static int val(char c){
       if (c >= '0' && c <= '9')
           return(int)c - '0';
       else
           return(int)c - 'A' + 10;
    }
   
    public void acquisisciDati(){
        System.out.println("Inserisci la base di partenza del numero: ");
        Scanner tastiera1 = new Scanner(System.in);
        basePartenza = tastiera1.nextInt();
                
        System.out.println("Inserisci la base di arrivo: ");
        Scanner tastiera2 = new Scanner(System.in);
        baseArrivo = tastiera2.nextInt();

        System.out.println("Inserisci il numero: ");
        Scanner tastiera = new Scanner(System.in);
        numero = tastiera.nextLine();
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
    
    public static int fromDecimale(String numero, int baseArrivo){
        
    }
}
