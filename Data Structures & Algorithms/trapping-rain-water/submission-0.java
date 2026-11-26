class Solution {
    public int trap(int[] h) {
        int left=0;int right=h.length-1;
        int totalWater=0;
        int maxleft=0,maxRight=0;

        while(left<right){
            if(h[left]<=h[right]){
                maxleft=Math.max(maxleft,h[left]);
                totalWater += Math.max(0, maxleft - h[left]);
                left++;
            }else{
                maxRight=Math.max(maxRight,h[right]);
                totalWater += Math.max(0, maxRight - h[right]);
                right--;
            }
        }

        return totalWater;
    }
}
