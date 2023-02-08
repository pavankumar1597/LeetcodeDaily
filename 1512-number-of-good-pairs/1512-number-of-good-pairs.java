class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0 ; 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums ){
            if(map.containsKey(n)){
                int rep = map.get(n);
                map.put(n,rep+1);
                count += rep ;
            }else{
                                map.put(n,1);

            }
        }
        
        return count ; 
        
    }
}