class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == ' '){
            int end = i-1;
               while(start<end){
               char temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start ++;end--;
               } start = i+1;
            }
        }
        int end = arr.length - 1;

        while(start < end) {
           char temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           
           start++;
           end--;}
        return new String(arr);
}}