class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        long res = 0;
        for (int i = 0; i <= n / 2; ++i)
            res += Math.max(0, nums[i] - k);
        for (int i = n / 2; i < n; ++i)
            res += Math.max(0, k - nums[i]);
        return res;
    }
    }