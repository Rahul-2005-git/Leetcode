class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i=0;i<nums1.length;i++){
            int add=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    j++;
                    while(j<nums2.length){
                        if(nums2[j]>nums1[i]){
                            add=nums2[j];
                            break;
                        }
                        j++;
                    }
                    nums1[i]=add;
                    break;
                }
            }
        }
        return nums1;
    }
}