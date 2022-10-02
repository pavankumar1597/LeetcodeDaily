package bitmanipulation.prefix;

import java.util.Arrays;

public class Solution {
    public int solve(int[] A) {

        int[] oddprefix =  new int[A.length]; 
        int[] evenprefix =  new int[A.length]; 
        
        oddprefix[0] =A[0];
        int count =0; 
            
        for(int i= 1; i < A.length; i++){
            if( i%2 == 0 ){
                oddprefix[i] = oddprefix[i-1]+A[i]; 
            }else {
                oddprefix[i] = oddprefix[i-1] ; 
            }
        }

        evenprefix[0] =  0; 

        for(int i= 1; i < A.length; i++){
            if( i%2 != 0 ){
                evenprefix[i] = evenprefix[i-1]+A[i]; 
            }else {
                evenprefix[i] = evenprefix[i-1] ; 
            }
        }



        System.out.print(Arrays.toString(oddprefix));
        System.out.print(Arrays.toString(evenprefix));
        for(int i = 0 ; i < A.length ; i++){

              int even = 0; 
                 int odd = 0 ; 
            if(i==0){
                even = oddprefix[ A.length - 1 ] - oddprefix[i] ;
                odd  = evenprefix[A.length - 1]  - evenprefix[i] ;
            }else{
                odd =  evenprefix[i-1] + oddprefix[ A.length-1 ] - oddprefix[i] ;
                even =   oddprefix[i-1] + evenprefix[ A.length-1 ] - evenprefix[i] ;
            }
            if(odd == even ){
count++;
            }
            

        }

        return 0 ; 

    }

    public static void main(String[] args) {
        new Solution().solve(new int[]{2,1,6,4});
    }
}
