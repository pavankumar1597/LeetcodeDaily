class Solution {
    public int countGoodSubstrings(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int count = 0 ; 
        
        int i = 0 ; 
         int  j = 0; 
    
        while(j < s.length() ){
            
            
            if((j-i) < 3){
                char jth =s.charAt(j) ;
                map.put(jth,map.getOrDefault(jth,0)+1);
                j++;
            }
            
            if( (j-i) == 3 ){
            if(map.size() == 3){
              count++;  
            }
                char ith = s.charAt(i);
                int ic= map.get(ith) ;
                 if( ic == 1 ){
                   map.remove(ith); 
                }else  map.put(ith,ic-1);
              
                i++;
            }
            
        }
        
        
        return count ; 
        
    }
}