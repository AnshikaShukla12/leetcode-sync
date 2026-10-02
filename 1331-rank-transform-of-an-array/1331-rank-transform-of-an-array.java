class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int[] copy=Arrays.copyOf(arr,n);
        Arrays.sort(copy);
        int val=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i],val);
                val++;
            }
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}