class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count=new int[51];
        for(int i=0;i<=nums.length-k;i++){
            boolean[] s=new boolean[51];
            for(int j=i;j<i+k;j++){
                int val=nums[j];
                if(!s[val]){
                    count[val]++;
                    s[val]=true;
                }
            }
        }
        int ans=-1;
        for(int i=50;i>=0;i--){
            if(count[i]==1){
                return i;
            }
        }
        return -1;
    }
}