class Solution {
    public String smallestPalindrome(String s) {
        char [] arr=s.toCharArray();

        int n=arr.length;
        Arrays.sort(arr,0,n/2);
        System.out.println(arr);
        if(n%2==0){

            for(int i=n/2;i<n;i++){
                arr[i]=arr[n-1-i];
        }
        }
        else{
            for(int i=n/2+1;i<n;i++){
                arr[i]=arr[n-1-i];
            }
        }
        
        

        return new String(arr);
        
    }
}