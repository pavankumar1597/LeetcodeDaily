class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0 ;
        int i = 0 ;
        for(List<Integer> list  : wall){
            int prefix = 0 ;
            for(int e = 0 ; e < list.size()-1 ;e++){
                prefix += list.get(e) ;
                map.put(prefix,map.getOrDefault(prefix,0)+1);
                
                if(map.get(prefix) > max ){
                    max = map.get(prefix) ;
                     i =  prefix ;
                }
                
            }
        }
        
        
        
        
        return wall.size()-max ;
        
        
    }
}