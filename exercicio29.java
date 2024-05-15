import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( " escreva um número");
        int numero = scanner.nextInt();
    
        boolean encontrado = false;

        for ( int i = 0; i < vetor.length; i++){
            if ( vetor[i] == numero){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
        System.out.println(" o numero " + numero + " esta no vetor");
        } 
        else  {
        System.out.println( " o numero " + numero + " não está no vetor");    
        }    
        scanner.close();
    }
}
