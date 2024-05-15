import java.util.Scanner;

public class exercicio27 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println( " digite a temperatura");
        double temperatura = scan.nextDouble();

        if ( temperatura < 12 ){
        System.out.println( " a temperatura está frio");
        }
        else if ( temperatura >= 12 && temperatura <=25 ){
        System.out.println( " a temperatura está moderada");    
        } else {
        System.out.println( " a temperatura está quente");    
        }
         scan.close();
    }
       

}
