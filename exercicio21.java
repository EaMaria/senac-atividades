import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println( " escreva um numero");
         double numero = scan.nextDouble();

        Double divisão = numero%3;
        
        if ( divisão == 0){
            System.out.println( " é múltiplo de 3");    
        }
        else if ( divisão != 0){
            System.out.println( " não é múltiplo de 3");
        }
        
        }
}
    

