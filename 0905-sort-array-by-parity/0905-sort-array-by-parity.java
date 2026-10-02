class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int m=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[m]=nums[i];
                m++;
            }
            if(m==n){
                return res;
            } 
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                res[m]=nums[i];
                m++;
            } 
            if(m==n){
                return res;
            }
        }
        return res;
    }
}