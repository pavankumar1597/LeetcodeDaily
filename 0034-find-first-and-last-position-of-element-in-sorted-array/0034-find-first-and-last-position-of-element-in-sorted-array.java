class Solution {
    int sl = -1 ; 
    int el = -1 ; 
    
    public int[] searchRange(int[] nums, int target) {
        if (nums.length ==  0){
       return  new int[]{sl,el};

        }         firstelem(nums ,target,0,nums.length-1);

        secondelem(nums, target,0,nums.length-1);
       return  new int[]{sl,el};
    }
    
    void secondelem(int[] nums ,int target,int s ,int e){
       if(s < 0 || e >= nums.length ){
           return ;
       }
        
        
        if(s > e){
           
return  ;
       }
        int mid = s + (e-s)/2 ;   
        
        if(nums[mid] < target  ){
        secondelem(nums, target,mid+1,e);
        }else if(nums[mid] > target){
       secondelem(nums, target,s,mid-1);
        }else{
            sl = mid ;
       secondelem(nums, target,s,mid-1);
        }
                
    }
    
    void firstelem(int[] nums ,int target,int s ,int e){
             if(s < 0 || e >= nums.length ){
           return ;
       }
          if(s > e){
           
return  ;
       }
   if(s == e){
                   if(nums[s] == target  ){
                       el  = s ;
                       return ;
                   }
return  ;
       }        int mid = s + (e-s)/2 ;   
        
        if(nums[mid] < target  ){
        firstelem(nums, target,mid+1,e);
        }else if(nums[mid] > target){
       firstelem(nums, target,s,mid-1);
        }else{
            el = mid ;
        firstelem(nums, target,mid+1,e);
        }  
    }
}