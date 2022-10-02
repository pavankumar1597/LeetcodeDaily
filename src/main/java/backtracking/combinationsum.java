package backtracking;

import java.util.*;

public class combinationsum {

    static  ArrayList<List<Integer>> arrays  = new ArrayList<List<Integer>>();

   static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> array  = new ArrayList<Integer>();


        recursion(0,candidates,target,array);
        return arrays ;
    }


    static void recursion(int index , int[] candidates, int target,ArrayList<Integer> array ){

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


    public static void main(String[] args) {
        System.out.println( combinationSum(new int[]{2,3,5,7},7));
    }
}