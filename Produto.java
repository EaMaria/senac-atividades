public class Produto {
    
    protected String nome;
    protected Double preco;
    protected int quantidadeEstoque;
    

    public Produto( String nome, Double preco, int quantidadeEstoque){
    this.nome = nome;
    this.preco= preco;
    this.quantidadeEstoque = quantidadeEstoque;
    }  
    public int adicionarEstoque (int quantidadeEstoque){
     return quantidadeEstoque =+ adicionarEstoque(quantidadeEstoque);
    }
    public int removerEstoque ( int quantidadeEstoque){
        return quantidadeEstoque -= removerEstoque(quantidadeEstoque);
    }
    public boolean verificarDisponibilidade(){
        return (quantidadeEstoque <0 );
    }
    public double calcularValorTotal(int quantidade){
        return preco*quantidade;
    }
    public void imprimir(){
    System.out.println(nome);
    System.out.println(preco);
    System.out.println(quantidadeEstoque);   
    }
    }