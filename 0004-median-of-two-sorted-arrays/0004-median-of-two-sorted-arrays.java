class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0,j=0;

        int n1=nums1.length;
        int n2=nums2.length;

        int []merge =new int[n1+n2];

        while(i!=n1 && j!=n2){
            if(nums1[i]>nums2[j]){
                merge[i+j]=nums2[j];
                j++;
            }
            else{
                merge[i+j]=nums1[i];
                i++;
            }
        }
        if(i==n1){
            while(j<n2){

            merge[i+j]=nums2[j];
            j++;
            }
        }
        else{
            while(i<n1){
                merge[i+j]=nums1[i];
                i++;
            }
        }

        double mid;
        if((n1+n2)%2==1){
            mid=merge[(n1+n2)/2];
        } else{
            mid=(merge[((n1+n2)/2)-1]+merge[(n1+n2)/2])/2.0;
        }

        return mid;
    }
}