class Solution {
    ArrayList<List<Integer>> mlist = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        subset(0, nums, list);
        return mlist;
    }

    void subset(int index, int[] nums, ArrayList<Integer> list) {
        if (index == nums.length) {
            mlist.add(new ArrayList<Integer>(list));
            return ;
        }

        list.add(nums[index]);
        subset(index + 1, nums, list);
        list.remove(list.size() - 1);

        subset(index + 1, nums, list);
    }
}
