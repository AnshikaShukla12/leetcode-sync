class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<ans){
                continue;
            }
            else if(nums[i]==ans){
                ans++;
            }
            else{
                return ans;
            }
        }
        return ans;
    }
}