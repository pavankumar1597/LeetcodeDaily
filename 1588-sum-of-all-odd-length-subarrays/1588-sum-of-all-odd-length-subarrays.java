class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        

int sum = 0  ;

        for(int i= 0 ; i < arr.length ; i++ )
        {

         int total = (i+1)*( arr.length-i)+1;
        
                   sum += (total/2 )*arr[i];
        }
        
        return sum ;
    }

}