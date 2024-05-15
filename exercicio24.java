import java.util.Scanner;

public class exercicio24 {

    public static void main(String[] args) {
        
    int[][] matriz;
    int tamanho; 
    Scanner scan = new Scanner(System.in);
    tamanho = scan.nextInt();
    matriz = new int [tamanho][tamanho];
    for (int i = 0; i < matriz.length; i++) {
       for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = i==j?1:0;
       } 
    }
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print( matriz[i][j]);
        }
        System.out.print("\n");
    } 
    scan.close();
    }
}
