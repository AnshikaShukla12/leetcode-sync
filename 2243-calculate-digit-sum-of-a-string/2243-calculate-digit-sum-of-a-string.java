class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            for(int j=0;j<k && (i+j)<s.length();j++){
                sum+=s.charAt(i+j)-'0';
            }
            sb.append(sum);
        }
        return digitSum(sb.toString(),k);
    }
}