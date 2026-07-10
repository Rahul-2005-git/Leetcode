class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int []res=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[i+j]=nums1[i];
                i++;
            }else{
                res[i+j]=nums2[j];
                j++;
            }

        }
        while(i<m){
            res[i+j]=nums1[i];
            i++;
        }
        while(j<n){
            res[i+j]=nums2[j];
            j++;
        }
        for(int k=0;k<m+n;k++){
            nums1[k]=res[k];
        }
    //    nums1=res;
        
    }
}