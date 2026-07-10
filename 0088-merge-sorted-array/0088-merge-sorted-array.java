class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        //int []res=new int[m+n];
        while( j<n && i<m+n){
            if(nums1[i]>=nums2[j]){
                int t=m+n-1;
                while(t>i){
                    nums1[t]=nums1[t-1];
                    t--;
                }
              nums1[i]=nums2[j];
                j++;
                i++;
           }else{
                i++;
            }

        }
        while(j<n){
                
              nums1[m+j]=nums2[j];
                j++;
        }
    
        
    }
}