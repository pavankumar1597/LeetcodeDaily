package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSum2 {
            static ArrayList<List<Integer>> arrays  = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> array  = new ArrayList<Integer>();
        Arrays.sort(candidates);
         recursion(0,candidates,target,array);
        return arrays ;
    }
    
    
    static void recursion(int index, int[] candidates, int target, ArrayList<Integer> array){
         // while((index > 0 && index < candidates.length) && (candidates[index]  == candidates[index-1])) {
        //     index ++;
        // } 
        if(target == 0 || index == candidates.length ){
            if(target == 0 ){
                arrays.add(new ArrayList<>(array));}
            return ; 
        }
        for(int i = index ; i < candidates.length ; i++){
        if( i > index && (candidates[i]  == candidates[i-1])) continue ;
        if (target-candidates[i] < 0) break ;
        array.add(candidates[i]);
        recursion(i+1,candidates,target-candidates[i],array);
        array.remove(array.size()-1);
        }
    }


    public static void main(String[] args) {

        System.out.println(combinationSum2(new int[]{1,1,1,2,2},5));

    }
}