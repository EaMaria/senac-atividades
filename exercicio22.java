import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class exercicio22 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner( System.in);
    System.out.println( " escreva um ano");
    double ano = scan.nextDouble();

    Double divisao = ano%25;

    if ( divisao == 0 ){
    System.out.println( " é um ano jubileu");
    }
    else if ( divisao != 0){
    System.out.println( " não é um ano jubileu");
    }

     Double divisao2 =ano%100;

     if ( divisao2 == 0){
    System.out.println( " é um ano de século");
     }
     else if ( divisao2 != 0){
    System.out.println( " não é um ano de século");
     }
     scan.close();
}
}
