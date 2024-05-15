package exercicio18;

public class Carro implements Veiculo,MeiodeTransporte{
    
    @Override
    public void mover(){
        System.out.println( " mover o carro" );
    }

    @Override
    public void para(){
        System.out.println("parar o carro");
    }
    }

