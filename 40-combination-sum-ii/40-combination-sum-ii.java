class Solution {
            ArrayList<List<Integer>> arrays  = new ArrayList<List<Integer>>(); 

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> array  = new ArrayList<Integer>(); 
        
        Arrays.sort(candidates);
         recursion(0,candidates,target,array);
        return arrays ;
    }
    
    
    void recursion(int index , int[] candidates, int target,ArrayList<Integer> array ){
        
        
        
        // while((index > 0 && index < candidates.length) && (candidates[index]  == candidates[index-1])) {
        //     index ++;
        // } 
        if(target == 0 || index == candidates.length ){
            if(target == 0 ){
                arrays.add(new ArrayList<>(array));
            }
            return ; 
        }

        
        for(int i = index ; i < candidates.length ; i++){
            
        if( i > index && (candidates[i]  == candidates[i-1])) {
            continue ;
        }        
        if (target-candidates[i] < 0){
            break ;
        }

                array.add(candidates[i]);
                recursion(i+1,candidates,target-candidates[i],array);
                array.remove(array.size()-1);

        }
      
       
        
     
               

  
        
    }
}