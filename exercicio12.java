import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Comprimento retangulo1: ");
        float compret1= scan.nextFloat();
        System.out.println("Largura retangulo1: ");
        float largret1= scan.nextFloat();

        System.out.println("Comprimento retangulo2: ");
        float compret2= scan.nextFloat();
        System.out.println("Largura retangulo2: ");
        float largret2= scan.nextFloat();
    
        Retangulo ret1 = new Retangulo(compret1, largret1);
        Retangulo ret2 = new Retangulo(compret2, largret2);
        
        if ( ret1.area() > ret2.area()){
            System.out.println( " a maior area é do: ret1 "  );
            scan.close();
        }
        else if ( ret2.area() > ret1.area()){
            System.out.println( " a maior area é do: ret2" );
        }
        
        }
}

