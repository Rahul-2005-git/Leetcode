class Solution {
    public String reverseWords(String s) {
        
        String [] arr=s.trim().split("\\s+");

        int n=arr.length;
        int i=0;
        while(i<n){
            n--;
            String temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
        }

        return String.join(" ", arr);
    }
}