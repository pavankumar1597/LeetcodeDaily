class Solution {
    public int kthGrammar(int A, int B) {
        
        if(A == 0 || B ==0){
            return 0;
        }
        
        int mid = (int)Math.pow(2,A-1);
        
        if(B  <= mid){
            
            return kthGrammar(A-1,B);
            
        }else{
            return 1-kthGrammar(A-1,B-mid);
   
        }
        
        
        
    }
}