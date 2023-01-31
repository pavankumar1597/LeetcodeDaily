class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int e = 0 ;
        for(String str : operations){
            
            if(str.indexOf("+") >= 0){
             e++;
        }else{
                e-- ;
            }
        
        
        
    }
                return e ;

}}