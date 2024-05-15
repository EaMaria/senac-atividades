public class exercicio26 {
     public static void main(String[] args) {
      
        int [][]matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]out = new int [3][3];

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out.length; j++) {
                out[i][j] = matriz [j][i] ;

           }
        }
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out.length; j++) {
                System.out.print(out [i][j]);
            }
        }
        System.out.println(" "); 
     }
}
