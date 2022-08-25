class Solution {
    public int countPrimes(int n) {
        
//     if( n < 2) return 0 ; 
//     if(n == 2) return 0 ;
        
//         int c = 1 ;
        
//         boolean[] isntprit = new boolean[n] ;
        
// for(int i = 3; i<n ; i=i+2){
    
//     if(!isntprit[i]){
//         c++;
//          for(int j = i*i; j < n ; j+=i){ 
//              isntprit[j] = true ; 
//          }
//     }
// }        
        
        
        
//         return c ;
        
        
        
           
        //Sieve of Erosthonus
        int count=0;
        if(n<=2)
            return 0; 
        boolean[] primes=new boolean[n];
        
        Arrays.fill(primes,true);
        primes[0]=false;
        primes[1]=false;
        
        for(int i=2; i*i<=n;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    primes[j]=false;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(primes[i])
            {
                count++;
            }
        }
        
        return count;
    }
}