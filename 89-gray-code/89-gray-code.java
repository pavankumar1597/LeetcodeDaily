class Solution {
    public List<Integer> grayCode(int a) {
        
            if(a ==1){
         return   new ArrayList<Integer>(){{
   add(0);
   add(1);
    
}};
        };
        List<Integer> resp =  grayCode(a-1);
        for(int i = resp.size()-1 ; i >= 0 ; i--){
          resp.add(resp.get(i)+(1<<(a-1)));
        }
        return resp ;
	
        
    }
}