class Solution {
    public void backtrack(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        if (subset.isEmpty() ||
            nums[index] != subset.get(subset.size() - 1)) {
            backtrack(nums, index + 1, subset, subsets);
        }

        subset.add(nums[index]);
        backtrack(nums, index + 1, subset, subsets);
        subset.remove(subset.size() - 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }
}