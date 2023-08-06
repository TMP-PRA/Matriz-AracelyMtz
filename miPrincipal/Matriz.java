package miPrincipal;

public class Matriz {
    public void imprime (int [][] c){
        for (int x=0; x < c.length; x++) {
                      for (int y=0; y < c[x].length; y++) {
                        System.out.print (c[x][y]);
                        if (y!=c[x].length-1) System.out.print("\t");
                      }
                      System.out.println();
                    }
        }
        public int[][] suma (int [][] A, int [][] B){
               // columnas de la matriz A
               int n= A[0].length;
               // filas de la matriz A
               int m= A.length;
               // filas de la matriz B
               int n2= B.length;
               // columnas de la matriz B
               int o= B[0].length;
               // nueva matriz 
               int [][] C= new int [m][o];
                          
               for (int j = 0; j < A.length; j++) {
                    for (int k = 0; k < B.length; k++) {
                     // aquí se multiplica la matriz
                        C[j][k] += A[j][k] + B[j][k];
                      }
                   }
               return C;
            }
        
        public int[][] multiplica (int [][] A, int [][] B){
               // columnas de la matriz A
               int n= A[0].length;
               // filas de la matriz A
               int m= A.length;
               // filas de la matriz B
               int n2= B.length;
               // columnas de la matriz B
               int o= B[0].length;
               // nueva matriz 
               int [][] C= new int [m][o];
                          
               for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < B.length; j++) {
                        for (int k = 0; k < A.length; k++) {
                            // aquí se multiplica la matriz
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
               return C;
            }
    
}