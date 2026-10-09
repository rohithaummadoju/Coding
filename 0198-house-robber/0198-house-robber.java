class Solution {
    public int rob(int[] nums) {
        int prev1=0,prev2=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i]+prev2;
            int s=prev1;
            int max=Math.max(t,s);
            prev2=prev1;
            prev1=max;
        }
        return prev1;
    }
}