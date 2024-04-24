import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float e = scan.nextFloat();
        int np = scan.nextInt();
        float tj = scan.nextFloat();
        float j = 0;

        j = tj*np*e;

        System.out.println( " o momtante é : " + (j+e));
        scan.close();
    }
}
