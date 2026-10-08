class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        int d=n/3;
        for(int i=d;i<n;i+=2){
            ans+=(long)nums[i];
        }   
        return ans;
    }
}