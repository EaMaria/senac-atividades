import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println( " digite nota1");
        double nota1 = scan.nextDouble();

        System.out.println( " digite nota2");
        double nota2 = scan.nextDouble();

        System.out.println( " digite nota3");
        double nota3 = scan.nextDouble();
    
        Alunos alu1 = new Alunos(null, null, null, null);
        Alunos alu2 = new Alunos(null, null, null, null);
    
        double soma = nota1+nota2+nota3%3;

        if (soma > 70 ){
            System.out.println(" aprovado");
            }
            else if ( soma  < 70){
           System.out.println(" reprovado");
       }
    }
}

