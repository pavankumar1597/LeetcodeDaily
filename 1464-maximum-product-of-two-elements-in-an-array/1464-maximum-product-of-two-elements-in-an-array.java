class Solution {
    public int maxProduct(int[] nums) {
           
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            q.add(num-1);
        }
        
        
        return q.poll() * q.poll() ;
    }
}