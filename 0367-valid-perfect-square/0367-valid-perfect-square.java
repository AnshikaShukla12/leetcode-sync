class Solution {
    public boolean isPerfectSquare(int num) {
        long i=0;
        long n=(long)num;
        while(i<=n){
            long mid=(i+n)/2;
            long sq=mid*mid;
            if(sq==(long)num)return true;
            else if(sq<num)i=mid+1;
            else n=mid-1;
        }
        // while(i<=n){
        //     if(i*i==(long)num)return true;
        //     if(n*n==(long)num)return true;
        //     i++;
        //     n--;
        // }
        return false;
    }
}