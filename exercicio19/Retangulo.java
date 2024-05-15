package exercicio19;

public class Retangulo implements Figura{
    
    private float altura;
    private float largura;

    public Retangulo( float largura,float altura){
        this.altura = altura;
        this.largura = largura;
    }

    public float getAltura(){
        return altura;
    }
    public float getLargura(){
        return largura;
    }

    @Override
    public float calcularArea(){
        return altura*largura;
    }
    @Override
    public float calcularPerimetro(){
        return (altura*2)+(largura*2);
    }    

}

