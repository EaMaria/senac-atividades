import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ano carro1: ");
        int ano1 = scan.nextInt();
      
        System.out.println("Ano carro2: ");
        int ano2 = scan.nextInt();

        System.out.println("Ano carro3: ");
        int ano3 = scan.nextInt();
                
        Carro car1 = new Carro (null, null, ano1, null);
        Carro car2 = new Carro (null, null, ano2, null);
        Carro car3 = new Carro (null, null, ano3, null);

        Carro [] carros = {car1, car2, car3};
        Carro maisvelho = car1;
        Carro maisnovo = car1;

        for (Carro carro : carros) {
            if (carro.getAno() < maisvelho.getAno()){
                maisvelho = carro;
            }
            else if (carro.getAno() > maisnovo.getAno()){
                maisnovo = carro;
            }
        }

        System.out.println( " o carro mais velho é: " + maisvelho.getAno() + "o mais novo é" + maisnovo.getAno());
        scan.close();    
    }    
    }

