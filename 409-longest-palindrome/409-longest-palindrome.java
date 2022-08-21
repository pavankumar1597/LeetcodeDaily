class Solution {
    public int longestPalindrome(String s) {
        
        
        HashMap<Character,Integer> map  = new HashMap<>();
        for(char chars  : s.toCharArray()){
            map.put(chars,map.getOrDefault(chars,0)+1);
        }
        int sc = 0 ; 
        int count = 0 ;
        

        
        
           for (int value : map.values()) {
    if(value%2 == 0 ){
        count += value;
    }else {
        count += value-1;
        sc =1;
    } 
}
        
        return (sc == 0)?count:count+1 ;
    }
}