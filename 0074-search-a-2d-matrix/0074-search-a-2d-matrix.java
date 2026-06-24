class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index=0;
        int mR=matrix.length;
        int mC=matrix[0].length;
        int s=0;
        int e=((mR)*mC)-1;

while(s<=e){
        int mid=s+(e-s)/2;

        if(matrix[mid/mC][(mid)%mC]==target){
            return true;
        }
        else if(matrix[mid/mC][(mid)%mC]<target){
            s=mid+1;
        }else{
            e=mid-1;
        }
}
return false;
    }
}