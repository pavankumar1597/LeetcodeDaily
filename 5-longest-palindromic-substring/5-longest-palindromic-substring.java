class Solution {
    public String longestPalindrome(String s) {
        
        
        
        int max =Integer.MIN_VALUE ;
        int a= 0 ;
             int b= 0  ;
        for(int i= 0 ; i<s.length();i++){
            
            
          int[] even=  checkPallindrome(s,i,i);
          int[] odd = checkPallindrome(s,i,i+1);
            
            
            int evend = even[1]-even[0] ;
            int oddd = odd[1]-odd[0] ;
            
            if(evend > oddd && max < evend){
                max = evend;
                a =  even[0];
                b =  even[1];
            }else if(max < oddd){
                max = oddd;
                a =  odd[0];
                b =  odd[1];
            }
        }
        return s.substring(a,b+1);        
        
         
        
    }
    
    
    
    
    
    int[] checkPallindrome(String s ,int i , int j){
        
        
        while( i >= 0 && j < s.length()){
            
            if( s.charAt(i) == s.charAt(j) ){
                i--;j++;
                
            }else{
                break ;
            }
            
        }
                    return  new int[]{i+1,j-1};

        
    }
}