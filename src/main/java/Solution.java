import java.util.Arrays;

public class Solution {
    public static int[][] solve(int[] A, int[] B) {

        int[][] uu = new int[B.length][A.length];


        for(int i = 0 ;i < B.length ; i++){

            int  k=B[i]%A.length;



            int[] org =     Arrays.copyOf(A, A.length);
            reverse(org,0,org.length-1);
            reverse(org,0,org.length-1-k);
            reverse(org,org.length-k,org.length-1);
            System.out.println(Arrays.toString(org));
            uu[i] = org;
        }



        return uu;

    }

    static void reverse(int[] A,int i , int j ){

        while( i < j  )
        {

            int temp = A[i];
            A[i]  = A[j];
            A[j]  =temp ;


            i++;
            j--;


        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3,4,5},new int[]{3})));
    }

}
