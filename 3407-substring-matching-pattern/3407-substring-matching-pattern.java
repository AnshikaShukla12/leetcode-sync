class Solution {
    public boolean hasMatch(String s, String p) {
        String[] arr=p.split("\\*");
        int idx=Integer.MIN_VALUE;
        String s1="";
        for(String a:arr){
            if(!a.equals("")){
                if(!s.contains(a)){
                    return false;
                }
                else{
                    if(idx==Integer.MIN_VALUE){
                        idx=s.indexOf(a);
                        idx+=a.length();
                    }
                    else{
                        s1=a;
                    }
                }
            }
        }
        int j=0;
        StringBuilder sb=new StringBuilder();
        if(idx==Integer.MIN_VALUE){
            return true;
        }
        for(int i=idx;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        if(!sb.toString().contains(s1))return false;
        return true;
    }
}