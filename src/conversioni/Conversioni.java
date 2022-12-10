package conversioni;

import java.util.Scanner;

/**
 *
 * @author utente
 */
public class Conversioni {
    
    private int basePartenza;
    private int baseArrivo;
    private String numero;
   
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
    
    public static char reVal(int num)
    {
        if (num >= 0 && num <= 9)
            return (char)(num + 48);
        else
            return (char)(num - 10 + 65);
    }
   
    public static int acquisisciDati(){
        Scanner tast = new Scanner(System.in);
        
        System.out.println("('1') Inserimento dati");
        System.out.println("('2') Calcolo e visualizzazzione conversione");
        System.out.println("('3') Salvare i dati su file");
        System.out.println("('4') Uscita programma");
        System.out.println("-Inserisci scelta-");
        
        int scelta = tast.nextInt();
        
        if(scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4){
            throw new RuntimeException("inserire una scelta valida");
        }
        return scelta;
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
    
    public static String fromDecimale(int numero, int baseArrivo){
        StringBuilder x = new StringBuilder ();
        int resto = 0;
        do{
            resto = numero % baseArrivo;
            x.append(resto);
            numero /= baseArrivo;
        }while(numero != 0);
        return new String(x.reverse());
    }
}
