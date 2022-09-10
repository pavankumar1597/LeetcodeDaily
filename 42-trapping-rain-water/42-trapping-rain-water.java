class Solution {
    public int trap(int[] height) {
        
        
        
               int[] leftMaxArr = leftMax(height);
        int[] rightMaxArr = rightMax(height);
        int ans = 0;
        for(int i=0; i<height.length; i++){
            int min = Math.min(leftMaxArr[i], rightMaxArr[i]);
            int waterTapped = min - height[i];
            ans+=waterTapped;
        }
        return ans;
    }
    
    public int[] leftMax(int[] A){
        int[] ans = new int[A.length];
        int max = A[0];
        for(int i=0; i<A.length; i++){
            max = Math.max(max, A[i]);
            ans[i]=max;
        }
        return ans;
    }
    public int[] rightMax(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        int max = A[n-1];
        for(int i=n-1; i>=0; i--){
            max = Math.max(max, A[i]);
            ans[i] = max;
        }
        return ans;
    }
        
    
}