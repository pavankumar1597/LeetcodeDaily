// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0 ;
        int j = 0;
        int max = 0 ;

        
        // using hash set ; 
//         Set<Character > set = new HashSet<Character>();
//         while(j < s.length()){
            
//             if(set.contains(s.charAt(j))){
//                  set.remove(s.charAt(i++));
//             }else{ 
//             set.add(s.charAt(j++));
//             max = Math.max(max,set.size());
//             } 
        
        
        // Using HashMap
           HashMap<Character,Integer> map = new HashMap<>();
            while(j < s.length()){
                
                if(map.containsKey(s.charAt(j))){
                    i = Math.max(map.get(s.charAt(j)),i);                 
                }
                  map.put(s.charAt(j),j+1); 
                  max = Math.max(max,j-i+1);
                    j++;
                }
                
    
        
        
        
        return max ;
    }
}