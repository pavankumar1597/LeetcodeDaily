class Solution {
    public int longestPalindrome(String s) {
        
        
        HashMap<Character,Integer> map  = new HashMap<>();
        for(char chars  : s.toCharArray()){
            map.put(chars,map.getOrDefault(chars,0)+1);
        }
        int sc = 0 ; 
        int count = 0 ;
        
//         for(Map.Entry<Character,Integer> entry : map.EntrySet()){
            
//         if(value%2 == 0 ){
//             count++;
//     }else if (sc == 0){
//         count++;
//         sc++;
//     }        }
        
        
        
        
           for (int value : map.values()) {
    if(value%2 == 0 ){
        count += value;
    }else if (sc == 0){
        count += value;
        sc++;
    }else if(sc == 1){
         count += value-1;
    
    }
       
       
}
        
        return count ;
    }
}