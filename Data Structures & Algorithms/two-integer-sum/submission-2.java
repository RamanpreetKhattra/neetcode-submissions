class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap();

        int r[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int sr= target-nums[i];
            if(map.containsKey(sr)){
                if(i!=map.get(target-nums[i]))
                {
                    r[1]=i;
                    r[0]=map.get(target-nums[i]);
                    return r;
                }
            }
            map.put(nums[i],i);
            
        }
        return r;
    }
}
