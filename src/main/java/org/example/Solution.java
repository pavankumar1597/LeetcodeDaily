package org.example;

import java.util.Arrays;

public class Solution {
    public int solve(int[] nums) {

        int B = 1;
        int[] prefix =new int[nums.length];
        prefix[0] = nums[0];
        
        for(int i = 1; i < nums.length ; i++){ 
            prefix[i] = prefix[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefix));


        int min  = Integer.MAX_VALUE;
        int sum  = Integer.MAX_VALUE;

        int i = 0;

        for(int k = B-1 ; k < nums.length ;k++){

                int diff = (k-B)+1;
                
                if(diff == 0){
                    min = Math.min(min,(prefix[k])/B);
                    i = diff;
                    System.out.println(min);

                    System.out.println("new At 0000 diff "+i);

                }else{
                    System.out.println(prefix[k] - prefix[k - B]);

                    int i1 = (prefix[k] - prefix[k - B]) / B;
                    System.out.println(i1);

                    if(min >= i1 ){
                        min  = i1;

                        if (sum > prefix[k] - prefix[k - B]) {
                            i = diff ;
                            sum = prefix[k] - prefix[k - B];
                            System.out.println("sumsumsumsumsumsumsumsumf sum "+ sum);

                        }
                        System.out.println("new diff diff "+i);
                    }
                    System.out.println("------------------------");

                }
        }
        System.out.println("----------------------------------------------------------op "+i);

        return i ;
    }



    public static void main(String[] args) {
        new Solution().solve(new int[]{3, 16, 11, 13, 19, 17, 11, 4, 9, 9, 6, 7, 3, 6, 12, 3, 4, 15, 5, 19});
    }

}
