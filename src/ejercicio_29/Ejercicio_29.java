package ejercicio_29;

/**
 *
 * @author EMILI
 */
import java.util.Scanner;
public class Ejercicio_29 {

   
    public static void main(String[] args) {
       Scanner digite = new Scanner(System.in);
       {
           int numero[];
           numero = new int[100];
           int n,i;
           
           System.out.println("Digite un numero");
           n = digite.nextInt();
           System.out.println("llenar lista");
           System.out.println(" ");
            for(i = 1; i <= n; i++)
            {
            System.out.println("VECTOR: ");
              numero[i - 1]=digite.nextInt();
            System.out.println("");
            }
            for(i = 1; i <= n; i++){
                if(numero [i - 1] % 5== 0)
                {
                    System.out.println("Vector"+"["+i+"]"+"Contiene: "+numero[i - 1]+ " es divisible de 5");
                    System.out.println(" ");
                }
            }     
       } 
    }
    
}
