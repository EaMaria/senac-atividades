import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inteiro = scan.nextInt();
        for (int i =2; i <= Math.sqrt(inteiro); i++){
            if (inteiro%i ==0){
                System.out.println( " nao é primo");
                System.exit(0);
            }
        }
        System.out.println( " é primo");
        scan.close();
    }
}
