class Solution {
    public int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int num=0;
        int[][] result=new int[n][n];
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                num++;
                result[top][j]=num;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                num++;
                result[i][right]=num;
                // num++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    num++;
                    result[bottom][j]=num;
                }   
            bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    num++;
                    result[i][left]=num;
                }
                left++;
            }
        }
        return result;
    }
}