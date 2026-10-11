class Solution {
    public boolean isPerfectSquare(int num) {
        long i=0;
        long n=(long)num;
        while(i<=n){
            if(i*i==(long)num)return true;
            if(n*n==(long)num)return true;
            i++;
            n--;
        }
        return false;
    }
}