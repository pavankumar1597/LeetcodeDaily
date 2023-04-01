class Solution {
    public int minimumOperations(int[] nums) {
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        
       Set<Integer> set = new HashSet<>(list);
        int c = 0 ;
        for(int s : set){
            if (s > 0 ) c++ ;
        }
        return c  ;
        
        
    }
}