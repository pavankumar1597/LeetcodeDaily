class Solution {
    public int findPeakElement(int[] nums) {
        
        
        int i = 0 ;  
        int j = nums.length-1; 
        int m = i+(j-i)/2 ;
        
        
        
return  localpeak(nums,0,j);
  
      
        
    }
    
    
    int localpeak(int[] nums,int s,int e){
                
                    if(s == e){
                        return e ;
                    }
                int m = s+(e-s)/2 ;
                
            if(nums[m] < nums[m+1]){
                return localpeak(nums,m+1,e);
            }else{
                return localpeak(nums,s,m);
            } 
                
                
    }
    
    
    
    
    
    
          
//         int s = 0 ;
//         int e = A.length-1;

//         while(s<e){
//             int m = s+(e-s)/2;

//             if(A[m] < A[m+1]){
//                 s = m+1;
//             }else{
//                 e = m; 
//             }
//         }

// return  A[s];


}