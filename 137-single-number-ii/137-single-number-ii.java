class Solution {

    public int singleNumber(int[] nums) {
        // method 1 : using hash map an ad count the frequency
        // method 2  : sorting the array ans count the successor index weather the element in index i  is equal to next element
        // method 3 :  take a 32 bit size array add all the cordinatinating position index bits in the arraya element  not take the mod of alla the elements in the arr , by taking mod of all the elements we would be getting   0 and 1 in the array , add all the elements now 
        // method 4 : similar to 3thd approach first iterater over all the biuts positions  one  by one fo the elements now 
        int ans =  0 ; 
        for( int i =0 ; i<32 ; i++ ){
            int c =  0 ;
            for( int num : nums ){
                
                if( (num & ( 1<<i )) != 0){
                    
                    c++;
                }
                
            }
            

            if(c%3 != 0){
                    
                ans  |= 1<<i ;
                
            }
            
        }
        
        return ans ;
        
    }
}
