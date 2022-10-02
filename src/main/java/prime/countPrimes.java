package prime;

import java.util.Arrays;

class countPrimes {
    public static int countPrimes(int n) {
        
    if( n < 2) return 0 ; 
    if(n == 2) return 0 ;
        
        int c = 1 ;
        
        boolean[] isntprit = new boolean[n] ;
        
for(int i = 3; i*i<n ; i=i+2){

    if(!isntprit[i]){
        c++;
         for(int j = i*i; j < n ; j+=i){
             isntprit[j] = true ;
         }
    }
}
        System.out.println(Arrays.toString(isntprit));





        return c ;
    }


    public static void main(String[] args) {
        System.out.println(countPrimes(100));
    }
}