class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st=0;
        int end=matrix.length-1;
        int cl=matrix[0].length;
        int row=-1;
        while(st<=end) {
            int mid=(st+end)/2;
            if(target<=matrix[mid][cl-1]) {
                row=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        if(row==-1) {
            return false;
        }
        int start=0;
        int last=cl-1;
        while(start<=last) {
            int mid=(start+last)/2;
            if(matrix[row][mid]==target) {
                return true;
            }
            else if(matrix[row][mid]<target) {
                start=mid+1;
            }
            else {
                last=mid-1;;
            }
        }
        return false;
    }
}