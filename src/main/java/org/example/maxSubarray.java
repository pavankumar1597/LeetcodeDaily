package org.example;

public class maxSubarray {
    public int maxSubarray(int A, int B, int[] nums) {



        int[] prefix =new int[A];
        prefix[0] = nums[0];

        int min = nums[0] ;
        int max = nums[0];


        for(int i = 1; i < A; i++){
            prefix[i] = prefix[i-1]+nums[i];
            max = Math.max(max,prefix[i]);
            min = Math.min(min,prefix[i]);
        }

        if(max < B) return max ;
        if(min > B) return 0 ;



        int l  =A-1 ;
        for(int i = 0; i < A ; i++){


            if(prefix[i] == B) return B ;
            l = i ;

            if(prefix[i] >= B){
                break;
            }
        }



        for(int i = 0; i <= l ; i++){
            if(i == 0 || l == A-1 )
                return prefix[l] ;


            if(prefix[l]-prefix[i] <= B ){

                return prefix[l]-prefix[i] ;
            }

        }

        return 0  ;


    }



}
