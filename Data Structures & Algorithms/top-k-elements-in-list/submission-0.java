class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        int res[]=new int[k];
        while(k>0){
            int max=Integer.MIN_VALUE;
            int key=0;
            for(Integer n : map.keySet()){
                int val=map.get(n);
                if(val>max){
                    max=val;
                    key=n;
                }
            }
            res[k-1]=key;
            k--;
            map.remove(key);
        }
        return res;
    }
}
