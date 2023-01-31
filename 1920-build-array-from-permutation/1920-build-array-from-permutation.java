class Solution {

    public int[] buildArray(int[] nums) {
        int s = nums.length;
        for (int i = 0; i < s; i++) {
            //since we edit the earlier elements we are not
            nums[i] = nums[i] + (nums[nums[i] % s] % s * s);
        }
        for (int i = 0; i < s; i++) {
            nums[i] = nums[i] / s;
        }

        return nums;
    }
}
