class Solution {
    public int countTriplets(int[] arr) {
        
        
        int[] prefix = new int[arr.length+1];
        
        prefix[0] =0 ;
        int count = 0  ;
        
        for(int i = 1 ; i <= arr.length ; i++){
            prefix[i] = prefix[i-1] ^ arr[i-1];
        }
        
        
        for(int i= 1 ;i <= arr.length -1 ; i++){
            
            for(int j = i+1 ; j <= arr.length ; j++){
             
                       
                for(int k= j ; k <= arr.length ; k++){
             
                  if((prefix[j-1] ^ prefix[i-1]) == (prefix[k] ^ prefix[j-1])) {
                        count++;
                    }
        
                    } 
                
            } 
        }
        return count;
        
    }
}