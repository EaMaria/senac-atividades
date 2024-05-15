public class ContaBancaria {
    
     private String nomedotitular;
     private String numerodaconta;
     private Double saldo;
     
    
    public  ContaBancaria (String nomedotitular,String numerodaconta,Double saldo ){
        this.nomedotitular= nomedotitular;
        this.numerodaconta= numerodaconta;
        this.saldo= saldo;
    
    }
    public String getNomedotitular(){
        return nomedotitular;
    }
    public String getNumerodaconta(){
        return numerodaconta;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void imprimir(){
        System.out.println(nomedotitular);
        System.out.println(numerodaconta);
        System.out.println(saldo);
    }
}

