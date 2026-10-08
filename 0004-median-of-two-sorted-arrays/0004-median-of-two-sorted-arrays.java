class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[m+n];
        for(int i=0;i<m;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums[i+m]=nums2[i];
        }
        Arrays.sort(nums);
        int ans=0;
        if((m+n)%2==0){
            return (nums[(m+n)/2 - 1] + nums[(m+n)/2]) / 2.0;
        }
        else{
            return nums[(m+n)/2];
        }
        // return ans;
    }
}