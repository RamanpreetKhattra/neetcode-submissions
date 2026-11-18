class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        int res[]=new int[k];
        //list because mutliple numbers can have same frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for(Integer n : map.keySet()){
            int val=map.get(n);
             if (buckets[val] == null) {
                buckets[val] = new ArrayList<>();
            }
            buckets[val].add(n);
        }
        for(int i=buckets.length-1;i>0;i--){
            if(buckets[i]!=null){
                List<Integer> tem=buckets[i];
                for(Integer n : tem){
                    if(k==0){
                        break;
                    }
                    res[k-1]=n;
                    k--;
                }
            }
        }
        return res;
    }
}
