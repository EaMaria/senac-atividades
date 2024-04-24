public class exercicio10 {
    public static void main(String[] args) {
        int [][] matriz = {{1,2},{3,4}};
        int ac = 0;
        int ec = 0;

        for (int i=0; i<2; i++){
            ec +=matriz [i][i];
        }

        for (int i=0;i<2;i++){
           for (int j=0;j<2;j++){
             if(i+j==(matriz.length-1)){
                ac += matriz[i][j];
             }
           } 
        }    
        
        System.out.println((ac + ec));
    }
}
