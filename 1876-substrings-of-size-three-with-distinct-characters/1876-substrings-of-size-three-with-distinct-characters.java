class Solution {
    public int countGoodSubstrings(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int count = 0 ; 
        
        int i = 0 ; 
         int  j = 0; 
    
        while(j < s.length() ){
            
            
            if((j-i) < 3){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                j++;
            }
            if(map.size() == 3){
                
              count++;  
            }
            
            if( (j-i) == 3 ){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))  == 0 ){
                   map.remove(s.charAt(i)); 
                }
                i++;
            }
            
        }
        
        
        return count ; 
        
    }
}