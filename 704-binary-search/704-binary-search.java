class Solution {
    public int search(int[] nums, int target) {
        return binrysearch(nums,target,0,nums.length-1);
        
    }
    
    
    
    int binrysearch(int[] numr , int target ,int s , int e){
        
        int mid = (s+e)/2 ;
        if(target < numr[s] || target > numr[e] || mid > numr.length-1 || mid < 0 ) return -1 ;
        
        if(target == numr[mid] ){
            return mid ;
        }else if(target > numr[mid]){
            return binrysearch(numr,target,mid+1,e);
        }else{
            return binrysearch(numr,target,0,mid-1);
        }
        
        
    }
}