class Solution {
            ArrayList<List<Integer>> arrays  = new ArrayList<List<Integer>>(); 

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> array  = new ArrayList<Integer>(); 
        
        
         recursion(0,candidates,target,array);
        return arrays ;
    }
    
    
    void recursion(int index , int[] candidates, int target,ArrayList<Integer> array ){
        
        if( index == candidates.length ){
            if(target == 0 ){
                arrays.add(new ArrayList<>(array));
            }
            return ; 
        }
        
        if( candidates[index] <= target  ){
             array.add(candidates[index]);
                recursion(index,candidates,target-candidates[index],array);
         
                array.remove(array.size()-1);
        }
                            recursion(index+1,candidates,target,array);

        
     
               

  
        
    }
}