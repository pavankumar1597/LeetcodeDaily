import java.util.Arrays;

public class submatrixsort {

  static  public int[] solve(int[][] Aa, int[] B, int[] C, int[] D, int[] E) {



        long[][] A = new long[Aa.length][Aa[0].length];
        for(int i= 0  ; i < A.length ;i++){
            for(int j= 0  ; j < A[0].length ;j++){
                A[i][j] = Aa[i][j];
            }
        }

        int[] arr = new int[B.length];
        rprefix(A) ;
        cprefix(A) ;
        for(int i = 0 ; i < B.length ;i++){
            int z , j , k , l = 0 ;
            z = B[i]-1;
            j = C[i]-1;
            k = D[i]-1;
            l = E[i]-1;
            long sum = A[k][l]  ;

            if(z > 0 ){
                sum -=  A[z-1][l] ;
            }

            if(j > 0 ){
                sum -= A[k][j-1];
            }

            if(j > 0 && z > 0 ){
                sum += A[z-1][j-1];
            }
            arr[i] = (int)sum ;

        }
        return arr ;
    }

    static void rprefix(long[][] A){
        for(int i=0  ; i < A[0].length ; i++){
            for(int j= 1  ; j < A.length ; j++){
                A[j][i] = A[j][i]+A[j-1][i];
            }
        }
    }

    static void cprefix(long[][] A){
        for(int i=0 ; i < A.length ; i++){
            for(int j= 1  ; j < A[0].length ; j++){
                A[i][j] = A[i][j]+A[i][j-1];
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(   solve(new int[][]{new int[]{1, 1, 1},
                new int[]{1, 1, 1},
                new int[]{1, 1, 1}   }, new int[]{1,2}  , new int[]{1,2}  , new int[]{2,3} , new int[]{2,3} )));
    }
}
