public class exercicio25 {
    public static void main(String[] args) {
        
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                a[i][j] += b [i][j];
            }
            for (int j = 0; j < b.length; j++) {
                for (int j2 = 0; j2 < b.length; j2++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println( " ");
            }
        }
    }

}
