import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          String a = scan.nextLine();
            int c=0;
          char b = scan.nextLine().charAt(0);
          for (int i= 0; i< a.length(); i++){
            if (a.charAt(i)==b){
             c += 1;       
            }
          }
          System.out.println(c);
          scan.close();
    }
}
