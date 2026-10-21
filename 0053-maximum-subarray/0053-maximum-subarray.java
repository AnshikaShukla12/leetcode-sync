class Solution {
    public int maxSubArray(int[] nums) {
        int curS=0;
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curS+=nums[i];
            if(curS>maxS){
                maxS=curS;   
            }
            if(curS<0){
                curS=0;
            }

        }
        return maxS;
    }
}