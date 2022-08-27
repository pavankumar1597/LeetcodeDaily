class Solution {
    public int longestMountain(int[] array) {
        
        
            int maxcount = 0  ;

    

    for(int i = 1 ; i< array.length-1 ; i++){
      boolean ispeak = (array[i]>array[i-1] && array[i]>array[i+1])  ;
      if(ispeak){
            int l = 0 ; 
    int r =0 ; 
        int peak =  i-1 ;
        while(peak > 0){
          
          if(array[peak] > array[peak-1]){
            l++;
            peak--;
          }else {
            break;
          }
        }
           peak =  i+1 ;

         while(peak < array.length-1){
          
          if(array[peak] > array[peak+1]){
            r++;
            peak++;
          }else {
            break;
          }
        }

        maxcount = Math.max(maxcount,(r+l+3));

        i = peak;
      }
      

      
    }
    return maxcount;
        
    }
}