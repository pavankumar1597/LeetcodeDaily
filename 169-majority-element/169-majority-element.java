class Solution {
    public int majorityElement(int[] nums) {
        
        
        
        //approach1 = hashtable pus  all the elements and take up ists frequency and iterate over its frequency
        // sort it and find the middle element you will get the output // as since the number cunt is greater then the n/2 tiimes so the middle element is always            majority element 
        
        
        //Boyer-Moore Voting Algorithm
        //If we had some way of counting instances of the majority element as +1+1 and instances of any other element as -1−1, summing them would make it obvious that the majority element is indeed the majority element.
        //the numbr which aits till the last is the majority element 
        
        
        
        
//         int c = 0 ; 
//         int major = 0 ;
//         for(int n : nums){
            
//             if( c == 0 ){
//                 major = n ;
//             }
            
//             c += (major == n)?1:-1;
                
            
//         }
        
        
//       return   major ;
        
        
        
        
        
        
        
        
        
        
              // we define a counter and an element variable
        int count = 0;
        int elm = 0;
        // Iterating
        for(int num : nums){
            // If the count is 0, then we update the element variable with the current value in the array
            if(count <= 0){
                elm = num;
            }
            // If we see the element again in the array, we increase the count
            if(num == elm){
                count++;
            }
            // If we don't see the element we decrease the count
            else{
                count--;
            }
        }
        // In the end, the element that remains in the value will be our majority element
        return elm;
        
        
        
        
        
    }
}