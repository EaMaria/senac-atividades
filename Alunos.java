public class Alunos {
    
    protected String nome;
    protected Double nota1;
    protected Double nota2;
    protected Double nota3;

    public Alunos (String nome, Double nota1, Double nota2, Double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public double calcularMedia(){
        return ((nota1+nota2+nota3)/3);
    }
    public boolean verificarAprovacao(){
        return (calcularMedia())<7;
    }
    public void imprimir(){
      System.out.println(nome);
      System.out.println(calcularMedia() + " voce esta aprovado");  
    }
    
}
