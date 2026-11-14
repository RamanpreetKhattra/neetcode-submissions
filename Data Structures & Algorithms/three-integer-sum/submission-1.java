class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
 
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int req=0-nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]==req){
                    List<Integer> lt=new ArrayList();
                    lt.add(nums[i]);
                    lt.add(nums[left]);
                    lt.add(nums[right]);
                    res.add(lt);
                    left++;
                    right--;
                    while(left< right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                     while(left< right && nums[right]==nums[right+1])
                    {
                        right--;
                    }
                }else if(nums[left]+nums[right]<req){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
