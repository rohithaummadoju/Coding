class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
    public int findfirst(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                ans=m;
                r=m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    public int findlast(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                ans=m;
                l=m+1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
}