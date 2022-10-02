package org.example;

public class subarrayleastavg {
    public int solve(int[] nums, int B) {



        int i = 0 ; 
         int j  =0  ;
         int max = Integer.MAX_VALUE ;
         int sum = 0 ; 
         int avg = Integer.MAX_VALUE ; 
         int indwx = 0 ;




         while(j < nums.length){

            sum += nums[j];
            if(j-i+1 < B){
                j++ ;
            }else if(j-i+1 == B){
                // avg =  Math.min(sum/B,avg); 
                if( (sum/B) <= avg  && max > sum){
                    avg = (sum/B) ;
                    indwx = i ;
                    max = sum ;
                    System.out.println( avg+"-------------"+indwx+"-----------"+sum);

                }


                System.out.println("sum      "+sum);
                System.out.println("avg      "+avg);
                System.out.println("-------------");
                sum   = sum - nums[i];
                j++;
                i++;
            }

         }



return indwx ;





        
    }



    public static void main(String[] args) {
        new subarrayleastavg().solve(new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11},9);
    }
}
