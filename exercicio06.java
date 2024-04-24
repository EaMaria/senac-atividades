import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " escreva um numero");
           double numero1 = scan.nextDouble();
        
           System.out.println( " escreva outro numero");
           double numero2 = scan.nextDouble();
         
           System.out.println( " escreva mais um numero");
           double numero3 = scan.nextDouble();
         
           Double soma = numero1 + numero2 + numero3/3 ;
          
           System.out.println( " a soma dos numeros é" + soma );
           scan.close();

    }
}
