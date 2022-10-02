package backtracking;

import java.util.ArrayList;
import java.util.List;

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,ans,new ArrayList<Integer>());  
       return ans ; 
    }
    
    
   void solve(int i, int[] nums, ArrayList<List<Integer>> ans , ArrayList<Integer> list  ){
        
        if(i >= nums.length ){
            ans.add(help(nums));
       return  ;     
        }
       
       for(int j = i ; j < nums.length ; j++){
           swap(i , j, nums);
    solve(i+1,nums,ans,new ArrayList<Integer>());

           swap(i , j, nums);
       }
       
        
        
        
        
        
    }
    
      private List<Integer> help(int[] nums){
      List<Integer> current = new ArrayList<>();
      for(int num: nums){
        current.add(num);
      }
      return current;
    }
    
    
    
    
    int[] swap(int i , int j , int[] nums){
        int t   =  nums[i];
        nums[i] = nums[j];
        nums[j] = t ;
        return nums ;
        
    }


    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[] {1,2,3,4}));
    }
}