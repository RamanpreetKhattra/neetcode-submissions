class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int maxLen= Integer.MIN_VALUE;
        for(int num : set){
            int len=1;
            if(set.contains(num-1)){
                continue;
            }else if(set.contains(num+1)){
                while(set.contains(num+1)){
                    num=num+1;
                    len++;
                }
            }
            maxLen= Math.max(maxLen,len);
        }
        return maxLen;
    }
}
