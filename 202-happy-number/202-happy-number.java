class Solution {
    public boolean isHappy(int n) {
        int i = 0 ; 
        int sum = 0 ;
        if(n == 1 ) return true ;
        
        Set<Integer> set = new HashSet<>();
        
        while(set.add(n)){
            
                  sum = 0 ;

        while(n >= 1){
           sum += Math.pow(n % 10,2) ;   
           n = n/10 ;
        }
            
        if(sum == 1 ){
            return true ; 
        }else{
            n = sum ;
        }
        
        } 
        
        
        return false ; 
        
    }
}