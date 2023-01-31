class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr = new int[2*nums.length]; 
                    int n = nums.length ; 

        for(int i = 0 ; i < 2*nums.length ;i++){
            if(i>=n){
                arr[i] = nums[i%n] ;

            }else{
                arr[i] = nums[i] ;
            }
            
            
        }
        return arr ;

    }
}