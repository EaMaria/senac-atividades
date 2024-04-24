import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
       Scanner scan = new  Scanner(System.in);
       System.out.println( " digite uma string");
       String input= scan.nextLine();
       

       int vogais = 0;
       for(int a= input.length() -1; a>=0 ; a--){
        if (input.charAt(a)=='a' || input.charAt(a)=='e' || input.charAt(a)=='i' || input.charAt(a)=='o' || input.charAt(a)=='u') {
            vogais +=1;
            
        }
       }
        System.out.println(" numero de vogais na string " + vogais);
        scan.close();
    }
}
