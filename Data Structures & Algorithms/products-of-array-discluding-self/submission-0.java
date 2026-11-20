class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1] * nums[i-1];
        }
        int suffix=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix= suffix * nums[i+1];
            res[i]=suffix * res[i];
        }
        return res;
    }
}  
