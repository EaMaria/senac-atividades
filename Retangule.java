public class Retangule {
    
    private float comprimento;
    private float largura;

    public Retangule ( float comprimento, float largura){
    this.comprimento = comprimento;
    this.largura = largura;
  }
   public float area(){
       return comprimento*largura;
  }
  public float perimetro(){
    return (comprimento*2)+(largura*2);
}

}
 