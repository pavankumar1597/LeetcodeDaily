class Solution {
    public int findNumbers(int[] nums) {
        
        int ans =0 ; 
       for(int i : nums){
           if((i >= 10 && i <=100) || (i >= 1000 && i <=10000)|| (i >= 100000 && i <=1000000) ){
               ans++; 
           }
       } 
        return ans; 
    }      
  
}